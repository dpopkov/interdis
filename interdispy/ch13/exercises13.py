import random
import stdio
import sys
import time


def all_equal(a, b, c):
    print('equal' if a == b == c else 'not equal')


def ex1_3_1():
    print()
    all_equal(10, 10, 10)
    all_equal(10, 10, 11)
    all_equal(10, 11, 10)
    all_equal(11, 10, 10)


def print_random_and_average(n):
    total = 0.0
    for i in range(n):
        d = random.random()
        total += d
        print(d)
    print(total / n)


# ex1_3_10 in java
def ex1_3_8():
    print()
    print_random_and_average(3)


# ex1_3_13 in java
def ex1_3_11():
    n = 123456789
    m = 0
    while n != 0:
        m = m * 10 + n % 10
        n //= 10
    print('n = ' + str(n))
    print('m = ' + str(m))


# ex1_3_14 in java
def ex1_3_12():
    print()
    f = 0
    g = 1
    for i in range(16):
        stdio.write(str(f) + ' ')
        f = f + g
        g = f - g


def print_powers_of2_less_than_or_equal(n):
    power = 1
    while power <= n:
        stdio.write(str(power) + ' ')
        power *= 2
    print()


# ex1_3_16 in java
def ex1_3_13():
    print()
    print_powers_of2_less_than_or_equal(-1)
    print_powers_of2_less_than_or_equal(1023)
    print_powers_of2_less_than_or_equal(1024)


def print_converted_to_base(n, base):
    digits = '0123456789ABCDEF'
    power = 1
    while power <= (n // base):
        power *= base
    while power > 0:
        digit = n // power
        stdio.write(digits[digit])
        if digit > 0:
            n %= power
        power //= base
    stdio.writeln()


# ex1_3_21 in java
def ex1_3_19():
    print()
    print_converted_to_base(11, 2)
    print_converted_to_base(255, 2)
    print_converted_to_base(256, 2)
    print_converted_to_base(255, 16)
    print_converted_to_base(256, 16)
    print_converted_to_base(257, 16)


def print_unique_factors(n):
    factor = 2
    while factor <= n // factor:
        if n % factor == 0:
            stdio.write(str(factor) + ' ')
            while n % factor == 0:
                n //= factor
        factor += 1
    if n > 1:
        stdio.write(n)
    print()


# ex1_3_27 in java
def ex1_3_25():
    print()
    print_unique_factors(17)
    print_unique_factors(1156)


def print_factors(n):
    factor = 2
    while factor <= n // factor:
        while n % factor == 0:
            print(factor)
            n //= factor
        factor += 1
    if n > 1:
        print(n)


def print_factors_longer(n):
    factor = 2
    while factor <= n:
        while n % factor == 0:
            print(factor)
            n //= factor
        factor += 1
    if n > 1:
        print(n)


def ex1_3_26():
    print()
    n = int(sys.argv[1])
    start = time.time()
    print_factors(n)
    printElapsed(start)
    start = time.time()
    print_factors_longer(n)
    printElapsed(start)


def printElapsed(start):
    end = time.time()
    print('Elapsed: ' + str((end - start) * 1000) + ' ms')


def print_checkerboard(size):
    for i in range(size):
        for j in range(size):
            stdio.write('* ' if (i + j) % 2 == 0 else '  ')
        print()


# ex1_3_29 in java
def ex1_3_27():
    print()
    print_checkerboard(3)
    print_checkerboard(8)


def greatest_common_divisor(a, b):
    if a == 0:
        return b
    elif a > b:
        return greatest_common_divisor(b, a)
    else:
        return greatest_common_divisor(b % a, a)


# ex1_3_30 in java
def ex1_3_28():
    print()
    print(greatest_common_divisor(15, 6))
    print(greatest_common_divisor(21, 56))


ex1_3_1()
ex1_3_8()
ex1_3_11()
ex1_3_12()
ex1_3_13()
ex1_3_19()
ex1_3_25()
ex1_3_26()
ex1_3_27()
ex1_3_28()
