# Программа 1.2.4. Квадратичная формула (1.2.3 in java)
import math
import sys
import stdio

b = float(sys.argv[1])
c = float(sys.argv[2])

discriminant = b * b - 4.0 * c
d = math.sqrt(discriminant)
stdio.writeln((-b + d) / 2.0)
stdio.writeln((-b - d) / 2.0)
