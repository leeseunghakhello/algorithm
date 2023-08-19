N = int(input())

if N < 10:
    print(N)
else:
    digits = len(str(N))
    answer = 0
    for i in range(1, digits):
        answer += i * (10 ** i - 10 ** (i - 1))
    answer += digits * (N - 10 ** (digits - 1) + 1)
    print(answer)
