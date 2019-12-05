import math
import random


# noinspection PyUnusedLocal
def ex1_2_1():
    print()
    a = 10
    b = 20
    t = a
    b = t
    a = b
    print('a = ', a)
    print('b = ', b)


def sum_of_squares(a):
    sin = math.sin(a)
    cos = math.cos(a)
    return sin * sin + cos * cos


def ex1_2_2():
    print()
    print("r = ", sum_of_squares(0.25))
    print("r = ", sum_of_squares(0.5))
    print("r = ", sum_of_squares(0.75))


def long_boolean_expression(a, b):
    return (not(a and b) and (a or b)) or ((a and b) or not(a or b))


def ex1_2_3():
    print()
    print(long_boolean_expression(True, True))
    print(long_boolean_expression(False, True))
    print(long_boolean_expression(True, False))
    print(long_boolean_expression(False, False))


# ex1_2_14 in java
def ex1_2_11():
    print()
    evenly_divide(8, 2)
    evenly_divide(2, 8)
    evenly_divide(4, 11)


def evenly_divide(a, b):
    r = a % b == 0 or b % a == 0
    print(r)


# ex1_2_15 in java
def ex1_2_12():
    print()
    print(can_make_triangle(3, 4, 5))
    print(can_make_triangle(2, 4, 7))


def can_make_triangle(a, b, c):
    bigger = a >= b + c or b >= a + c or c >= a + b
    return not bigger


# ex1_2_19 in java
def ex1_2_16():
    print()
    print(random.randint(0, 10))
    print(random.randint(3, 4))
    print(random.randint(-1, 1))


ex1_2_1()
ex1_2_2()
ex1_2_3()
ex1_2_11()
ex1_2_12()
ex1_2_16()
