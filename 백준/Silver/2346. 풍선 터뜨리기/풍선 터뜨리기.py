from collections import deque

n = int(input())
data = list(map(int, input().split()))

queue = deque([(value, idx+1) for idx, value in enumerate(data)])

result = []

while queue:
    move, idx = queue.popleft()
    result.append(idx)
    
    if not queue:
        break

    # 양수일 때
    if move > 0:
        for _ in range(move - 1):
            queue.append(queue.popleft())
    
    # 음수일 때
    else:
        for _ in range(abs(move)):
            queue.appendleft(queue.pop())

print(*result)
