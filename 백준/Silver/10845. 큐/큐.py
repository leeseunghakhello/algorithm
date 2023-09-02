#파이썬 내장 모듈인 collections의 deque사용하여 큐 구현 
from collections import deque
import sys

n = int(input())
queue = deque()

for _ in range(n):
    command = sys.stdin.readline().split()
    
    if command[0] == 'push':
        queue.append(int(command[1]))
    elif command[0] == 'pop':
        print(queue.popleft() if queue else -1)
    elif command[0] == 'size':
        print(len(queue))
    elif command[0] == 'empty':
        print(1 if not queue else 0)
    elif command[0] == 'front':
        print(queue[0] if queue else -1)
    elif command[0] == 'back':
        print(queue[-1] if queue else -1)
