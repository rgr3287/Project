import RPi.GPIO as GPIO
import time

def servoMotor(servoPIN, status):
    c = 0
    if status == "on":
        c = 12
    else:
        c = 3

    GPIO.setmode(GPIO.BOARD)
    GPIO.setup(servoPIN, GPIO.OUT)
    pwm=GPIO.PWM(servoPIN, 50)

    pwm.start(c)
    time.sleep(2)

    pwm.stop()
    GPIO.cleanup(servoPIN)
