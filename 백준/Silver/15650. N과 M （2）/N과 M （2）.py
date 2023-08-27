N, M = map(int, input().split())

visited = [False] * (N + 1)
output = []

def solve(depth, start, N, M):
    if depth == M:
        print(' '.join(map(str, output)))
        return
    for i in range(start, N + 1):
        if not visited[i]:
            visited[i] = True
            output.append(i)
            solve(depth + 1, i + 1, N, M)  # 이전에 선택한 숫자 다음부터 선택 가능
            visited[i] = False
            output.pop()

solve(0, 1, N, M)
