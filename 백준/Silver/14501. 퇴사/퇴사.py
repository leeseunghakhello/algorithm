N = int(input())

T = []  # 각 상담을 완료하는데 걸리는 시간
P = []  # 각 상담을 완료했을 때 받는 금액
dp = [0] * (N + 1)  # i일까지의 최대 이익을 저장하는 배열

for _ in range(N):
    t, p = map(int, input().split())
    T.append(t)
    P.append(p)

for i in range(N):
    # i일에 상담이 끝나는 날이 N일을 넘지 않는 경우
    if i + T[i] <= N:
        dp[i + T[i]] = max(dp[i + T[i]], dp[i] + P[i])
    # i일까지의 최대 이익을 i+1일의 최대 이익과 비교하여 갱신
    dp[i + 1] = max(dp[i + 1], dp[i])

print(dp[N])
