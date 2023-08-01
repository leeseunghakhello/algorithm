def calculate_values(A, B, C):
    value_1 = (A + B) % C
    value_2 = ((A % C) + (B % C)) % C
    value_3 = (A * B) % C
    value_4 = ((A % C) * (B % C)) % C
    return value_1, value_2, value_3, value_4

A, B, C = map(int, input().split())

result = calculate_values(A, B, C)
print(result[0])
print(result[1])
print(result[2])
print(result[3])