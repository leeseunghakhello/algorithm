def backtrack(seq, n, m):
    # m개의 수를 선택했을 경우 출력
    if len(seq) == m:
        print(' '.join(map(str, seq)))
        return
    
    for i in range(1, n+1):
        backtrack(seq + [i], n, m)

n, m = map(int, input().split())
backtrack([], n, m)
