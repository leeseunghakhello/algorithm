#heapq 모듈을 사용
import heapq
import sys

input = sys.stdin.readline
n = int(input())
h = []

for _ in range(n):
    x = int(input())
    
    if x == 0:
        if len(h) == 0:
            print(0)
        else:
            print(-heapq.heappop(h))#값을 pop할 때는 다시 양수로 변환하여 결과를 출력
    else:
        heapq.heappush(h, -x)#heapq 모듈은 최소 힙을 기반으로 동작하기 때문에 최대 힙을 구현하기 위해서는 입력되는 값을 음수로 변환하여 사용
