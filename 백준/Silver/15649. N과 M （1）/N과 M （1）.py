N, M = map(int, input().split())

visited = [False] * (N + 1)
output = []

def solve(depth, N, M):
    if depth == M:
        print(' '.join(map(str, output)))
        return
    for i in range(1, N + 1):
        if not visited[i]:
            visited[i] = True
            output.append(i)
            solve(depth + 1, N, M)
            visited[i] = False
            output.pop()

solve(0, N, M)
