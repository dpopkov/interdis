import sys
import random

n = int(sys.argv[1])
size = n * 2
x = n
y = n
count_steps = 0
while True:
    direction = random.randint(0, 4)
    if direction == 0:
        x -= 1
    elif direction == 1:
        y -= 1
    elif direction == 2:
        x += 1
    else:
        y += 1
    print("(%d, %d)" % (x, y))
    count_steps += 1
    if x < 0 or x >= size or y < 0 or y >= size:
        print('Walker hits the boundary')
        print("Walker made %d steps" % count_steps)
        break
