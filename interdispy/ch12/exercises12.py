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


# ex1_2_20 in java
def ex1_2_17():
    print()
    a = random.randint(1, 6)
    b = random.randint(1, 6)
    print(a + b)


# ex1_2_23 in java
def ex1_2_20():
    print()
    print(within_interval(19, 3))
    print(within_interval(20, 3))
    print(within_interval(21, 3))
    print(within_interval(15, 5))
    print(within_interval(20, 6))
    print(within_interval(19, 6))
    print(within_interval(21, 6))


def within_interval(day, month):
    start_day = 20
    start_month = 3
    end_day = 20
    end_month = 6
    out = False
    if month < start_month or end_month < month:
        out = True
    elif month == start_month:
        out = day < start_day
    elif month == end_month:
        out = day > end_day
    return not out


def ex1_2_21():
    print()
    print(continuously_compounded_interest(10000, 3, 0.05))
    print(continuously_compounded_interest(20000, 10, 0.15))


def continuously_compounded_interest(investment, years, annual_rate):
    return investment * (math.e ** (annual_rate * years))


# ex1_2_34 in java
def ex1_2_31():
    print()
    three_sort(10, 30, 20)
    three_sort(30, 20, 10)
    three_sort(20, 10, 30)


def three_sort(a, b, c):
    if b < a:
        t = a
        a = b
        b = t
    if c < a:
        t = a
        a = c
        c = t
    if c < b:
        t = b
        b = c
        c = t
    print(a, b, c, ' ')


ex1_2_1()
ex1_2_2()
ex1_2_3()
ex1_2_11()
ex1_2_12()
ex1_2_16()
ex1_2_17()
ex1_2_20()
ex1_2_21()
ex1_2_31()
