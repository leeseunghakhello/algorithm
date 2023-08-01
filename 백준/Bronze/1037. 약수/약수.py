def find_N(num_real, real):
    max_real = max(real)
    min_real = min(real)
    N = max_real * min_real
    return N

# 입력 받기
num_real = int(input())  # 진짜 약수의 개수
real = list(map(int, input().split()))  # 진짜 약수들을 리스트로 입력 받는다

# N 구하기
N = find_N(num_real, real)

# 결과 출력
print(N)