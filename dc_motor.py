import RPi.GPIO as gpio
import time

#pins = (7, 11, 13, 15)

class DCMotor:
    def __init__(self, pins):
        self.pins = pins

    def initialize_gpio(self):
        gpio.setmode(gpio.BOARD)
        gpio.setup(self.pins[0], gpio.OUT)
        gpio.setup(self.pins[1], gpio.OUT)
        gpio.setup(self.pins[2], gpio.OUT)
        gpio.setup(self.pins[3], gpio.OUT)

    def forward(self):
        self.initialize_gpio()
        gpio.output(self.pins[0], True)
        gpio.output(self.pins[1], False)
        gpio.output(self.pins[3], True)
        gpio.output(self.pins[2], False)

    def reverse(self):
        self.initialize_gpio()
        gpio.output(self.pins[0], False)
        gpio.output(self.pins[1], True)
        gpio.output(self.pins[3], False)
        gpio.output(self.pins[2], True)

    def turn_left(self):
        self.initialize_gpio()
        gpio.output(self.pins[0], True)
        gpio.output(self.pins[1], False)
        gpio.output(self.pins[3], True)
        gpio.output(self.pins[2], True)

    def turn_right(self):
        self.initialize_gpio()
        gpio.output(self.pins[0], True)
        gpio.output(self.pins[1], True)
        gpio.output(self.pins[3], True)
        gpio.output(self.pins[2], False)

    def pivot_right(self):
        self.initialize_gpio()
        gpio.output(self.pins[0], False)
        gpio.output(self.pins[1], True)
        gpio.output(self.pins[3], True)
        gpio.output(self.pins[2], False)

    def pivot_left(self):
        self.initialize_gpio()
        gpio.output(self.pins[0], True)
        gpio.output(self.pins[1], False)
        gpio.output(self.pins[3], False)
        gpio.output(self.pins[2], True)
    
    def cleanup_gpio(self):
        self.initialize_gpio()
        gpio.cleanup()

# must use python3
class DCMotorInterval(DCMotor):
    def __init__(self, pins, sleep_t):
        super().__init__(pins)
        self.sleep_t = sleep_t

    def forward(self):
        super().forward()
        time.sleep(self.sleep_t)
        gpio.cleanup()

    def reverse(self):
        super().reverse()
        time.sleep(self.sleep_t)
        gpio.cleanup()

    def turn_left(self):
        super().turn_left()
        time.sleep(self.sleep_t)
        gpio.cleanup()

    def turn_right(self):
        super().turn_right()
        time.sleep(self.sleep_t)
        gpio.cleanup()

    def pivot_right(self):
        super().pivot_right()
        time.sleep(self.sleep_t)
        gpio.cleanup()

    def pivot_left(self):
        super().pivot_left()
        time.sleep(self.sleep_t)
        gpio.cleanup()

stop_motor = DCMotor((7, 11, 13, 15))

stop_motor.cleanup_gpio()
