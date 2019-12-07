import sys
import stdio

# Программа 1.3.5. Гармонические числа
n = int(sys.argv[1])
total = 0.0
for i in range(1, n + 1):
    total += 1.0 / i
stdio.writeln(total)
