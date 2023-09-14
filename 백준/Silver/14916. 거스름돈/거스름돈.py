n = int(input())

# 5원짜리 동전으로 최대한 많이 나눌 때의 몫을 구함
five_coins = n // 5

while five_coins >= 0:
    # 5원짜리 동전으로 나누고 남은 금액
    remaining = n - (five_coins * 5)
    
    # 남은 금액이 2원짜리 동전으로 나누어 떨어지면
    if remaining % 2 == 0:
        two_coins = remaining // 2
        print(five_coins + two_coins)
        break
    # 5원 동전의 개수를 하나 줄임
    five_coins -= 1
# 만약 모든 경우의 수를 다 시도해도 나누어 떨어지지 않으면 -1 출력
else:
    print(-1)
