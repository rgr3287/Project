import RPi.GPIO as GPIO
import time

def led(PINS, status, RGBNUM):
    RGBs = (
        (1,1,1),
        (1,0,0),
        (0,1,0),
        (0,0,1),
        (0,1,1),
        (1,0,1),
        (1,1,0),
    )

    GPIO.setmode(GPIO.BOARD)

    GPIO.setup(PINS[0], GPIO.OUT)
    GPIO.setup(PINS[1], GPIO.OUT)
    GPIO.setup(PINS[2], GPIO.OUT)

    if status == True:
        GPIO.output(PINS[0], RGBs[RGBNUM][0])
        GPIO.output(PINS[1], RGBs[RGBNUM][1])
        GPIO.output(PINS[2], RGBs[RGBNUM][2])

    else:
        GPIO.cleanup(PINS)

    '''
    if status == True:
        GPIO.output(PIN, True)

    else:
        GPIO.cleanup()
    '''
