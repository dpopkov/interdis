import random
import stdio


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


ex1_3_1()
ex1_3_8()
ex1_3_11()
ex1_3_12()
ex1_3_13()
