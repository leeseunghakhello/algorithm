from collections import deque

# BFS
def bfs(graph, start, end):
    visited = [-1] * (len(graph))
    queue = deque([start])
    visited[start] = 0
    while queue:
        v = queue.popleft()#deque의 가장 앞쪽 원소를 제거하고 그 값을 반환 ->O(1)의 시간 복잡도로 빠르게 처리
        for i in graph[v]:
            if visited[i] == -1:
                visited[i] = visited[v] + 1
                queue.append(i)
    return visited[end]

n = int(input())
a, b = map(int, input().split())
m = int(input())

graph = [[] for _ in range(n+1)]
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

print(bfs(graph, a, b))
