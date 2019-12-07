# Program 1.3.4 Prints an n-by-n table with an asterisk in row i and column j if either i divides j or j divides i.
import sys
import stdio

n = int(sys.argv[1])
for i in range(1, n + 1):
    for j in range(1, n + 1):
        if i % j == 0 or j % i == 0:
            stdio.write('* ')
        else:
            stdio.write('  ')
    stdio.writeln()
