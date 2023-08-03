# 소수 판별 함수
def is_prime(number):
    if number < 2:
        return False
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True

# 입력받기
N = int(input())
numbers = list(map(int, input().strip().split()))

# 소수 카운트
prime_count = 0
for number in numbers:
    if is_prime(number):
        prime_count += 1

# 결과 출력
print(prime_count)