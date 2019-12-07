# Программа 1.3.6. Метод Ньютона
import sys
import stdio

c = float(sys.argv[1])
EPSILON = 1e-15
t = c
while abs(t - c / t) > EPSILON * t:
    t = (c / t + t) / 2.0
stdio.writeln(t)
