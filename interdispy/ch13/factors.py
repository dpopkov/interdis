# Программа 1.3.0. Разложение на простые множители.
import sys
import stdio

n = int(sys.argv[1])
factor = 2
while factor * factor < n:
    while (n % factor) == 0:
        n //= factor
        stdio.write(str(factor) + ' ')
    factor += 1
if n > 0:
    stdio.write(n)
stdio.writeln()
