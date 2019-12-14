import math
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
    print_elapsed(start)
    start = time.time()
    print_factors_longer(n)
    print_elapsed(start)


def print_elapsed(start):
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
    x = a
    y = b
    if a > b:
        x = b
        y = a
    while y % x != 0:
        tmp = x
        x = y % x
        y = tmp
    return x


# ex1_3_30 in java
def ex1_3_28():
    print()
    print(greatest_common_divisor(15, 6))
    print(greatest_common_divisor(21, 56))


def relatively_prime(n):
    stdio.write('  ')
    for i in range(n):
        print('%2d' % (i + 1), end='')
    print()
    for i in range(n):
        print('%2d' % (i + 1), end='')
        for j in range(n):
            c = ' *' if greatest_common_divisor(i + 1, j + 1) == 1 else '  '
            print(c, end='')
        print()


# ex1_3_31 in java
def ex1_3_29():
    print()
    relatively_prime(5)
    relatively_prime(20)


def print_sum_of_two_cubes_in_different_ways(n):
    m = math.ceil(math.pow(n, 1.0 / 3.0))
    for i in range(1, m):
        i3 = i * i * i
        for j in range(i + 1, m):
            j3 = j * j * j
            for k in range(1, m):
                k3 = k * k * k
                for q in range(k + 1, m):
                    q3 = q * q * q
                    if i == k or j == q or (i == q and k == j):
                        continue
                    n1 = i3 + j3
                    n2 = k3 + q3
                    if n1 > n or n2 > n:
                        break
                    if n1 == n2:
                        print("%d ^ 3 + %d ^ 3 == %d ^ 3 + %d ^ 3 == %d" % (i, j, k, q, n1))


# ex1_3_34 in java
def ex1_3_30():
    print()
    print_sum_of_two_cubes_in_different_ways(1729)


def calculate_checksum(isbn):
    total = 0
    last = len(isbn) - 1
    m = 2 if (last == 8) else 1
    for i in range(last, -1, -1):
        ch = isbn[i]
        digit = 10 if ch == 'X' else (ord(ch) - ord('0'))
        total += m * digit
        m += 1
    return total


def add_checksum_digit(uncheched_isbn):
    checksum = calculate_checksum(uncheched_isbn)
    check_digit = 11 - checksum % 11
    check_digit = 0 if (check_digit == 11) else check_digit
    return uncheched_isbn + ('X' if check_digit == 10 else str(check_digit))


# ex1_3_35 in java
def ex1_3_33():
    print()
    print(add_checksum_digit('020131452'))
    print(add_checksum_digit('226611156'))


def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def count_primes(n):
    count = 0
    for i in range(2, n + 1):
        if is_prime(i):
            count += 1
    return count


# ex1_3_36 in java
def ex1_3_34():
    print()
    print(count_primes(5))
    print(count_primes(30))


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
ex1_3_29()
ex1_3_30()
ex1_3_33()
ex1_3_34()
