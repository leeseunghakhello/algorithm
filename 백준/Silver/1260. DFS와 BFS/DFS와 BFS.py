from collections import deque

def dfs(graph, start, visited):
    visited[start] = True
    print(start, end=' ')

    for i in sorted(graph[start]):
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True

    while queue:
        v = queue.popleft()
        print(v, end=' ')

        for i in sorted(graph[v]):
            if not visited[i]:
                queue.append(i)
                visited[i] = True

# 입력
n, m, v = map(int, input().split())
graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

visited_dfs = [False] * (n + 1)
dfs(graph, v, visited_dfs)
print()

visited_bfs = [False] * (n + 1)
bfs(graph, v, visited_bfs)
