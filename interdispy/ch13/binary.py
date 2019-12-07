# Программа 1.3.7. Преобразование в двоичный формат.
import sys
import stdio

n = int(sys.argv[1])
power = 1
while power < n / 2:
    power *= 2
while power > 0:
    if n < power:
        stdio.write('0')
    else:
        stdio.write('1')
        n -= power
    power //= 2
stdio.writeln()
