def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

# 두 개의 자연수를 입력
A, B = map(int, input().split())

# 최대 공약수(gcd)와 최소 공배수(lcm)를 계산
gcd_result = gcd(A, B)
lcm_result = lcm(A, B)

# 결과를 출력
print(gcd_result)
print(lcm_result)