import sys

# 입력 최적화 및 재귀 깊이 설정
input = sys.stdin.readline
sys.setrecursionlimit(10**9)

n, m, r = map(int, input().split())

# 그래프 표현을 위한 리스트
graph = [[] for _ in range(n + 1)]
# 방문한 정점의 순서를 저장하기 위한 리스트
visited_order = [0] * (n + 1)
count = 1

# 간선 정보 입력받기
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

# DFS 함수 정의
def dfs(v):
    global count
    visited_order[v] = count
    count += 1
    # 정점의 인접 리스트를 오름차순으로 정렬하고 DFS 탐색
    for adj in sorted(graph[v]):
        if visited_order[adj] == 0:
            dfs(adj)

# 시작 정점으로 DFS 시작
dfs(r)

# 결과 출력
for order in visited_order[1:]:
    print(order)
