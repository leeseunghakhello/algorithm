T = int(input())

#다이나믹 프로그래밍 (Dynamic Programming)을 이용해 해결
for _ in range(T):
    n = int(input())

    # 기본값 설정 (ways[0]은 dummy로 사용)
    ways = [0, 1, 2, 4]

    # 4부터 n까지 ways 값을 계산
    for i in range(4, n + 1):
        ways.append(ways[i-1] + ways[i-2] + ways[i-3])

    print(ways[n])
