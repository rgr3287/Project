import RPi.GPIO as gpio
import time
from flask import Flask, render_template, Response, jsonify
from camera_pi import Camera
from dc_motor import DCMotorInterval
from dc_motor import DCMotor
from servo_motor import servoMotor
from led import led

DC = DCMotor((7, 11, 13, 15)) # gpio pins
DCInterval = DCMotorInterval((7, 11, 13, 15), 0.1) # gpio pins, time.sleep(ms)
SERVOPIN = 16 # servo_motor_gpio_pins
LEDPINS = (18,19,21)

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/dc_motor/<int:id>')
def move_continuous(id):
    """DC motor continuous control page"""
    directions = [DC.forward, DC.reverse, DC.turn_left, DC.turn_right, DC.pivot_left, DC.pivot_right, DC.cleanup_gpio]
    directions[id]()
    return render_template('dc_motor.html')

@app.route('/dc_motor_interval/<int:id>')
def move_interval(id):
    """DC motor interval control page"""
    directions = [DCInterval.forward, DCInterval.reverse, DCInterval.turn_left, DCInterval.turn_right, DCInterval.pivot_left, DCInterval.pivot_right]
    directions[id]()
    return render_template('dc_motor_interval.html')

@app.route('/camera')
def camera():
    """Video streaming home page."""
    return render_template('camera.html')

@app.route('/video_feed')
def video_feed():
    """Video streaming route. Put this in the src attribute of an img tag."""
    return Response(gen(Camera()),
                    mimetype='multipart/x-mixed-replace; boundary=frame')

def gen(camera):
    """Video streaming generator function."""
    while True:
        frame = camera.get_frame()
        yield (b'--frame\r\n'
               b'Content-Type: image/jpeg\r\n\r\n' + frame + b'\r\n')

@app.route('/servo_motor_on')
def servo_on():
    servoMotor(SERVOPIN, "on")
    return render_template('servo_on.html')

@app.route('/servo_motor_off')
def servo_off():
    servoMotor(SERVOPIN, "off")
    return render_template('servo_off.html')

@app.route('/led_on/<int:id>')
def led_on(id):
    led(LEDPINS, True, id)
    return render_template('led_on.html')

@app.route('/led_off')
def led_off():
    led(LEDPINS, False, -1)
    return render_template('led_off.html')

if __name__ == '__main__':
    app.run(host='0.0.0.0', port =8080, debug=True, threaded=True)