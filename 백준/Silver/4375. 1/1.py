def find_smallest_multiple_one(n):
    num = 1
    while True:
        # 자릿수가 1로만 이루어진 수를 찾기 위해 1만으로 이루어진 문자열
        one_str = '1' * num
        
        # 1로만 이루어진 문자열을 정수로 변환
        one_int = int(one_str)
        
        # n으로 나누어 떨어지는지 확인
        if one_int % n == 0:
            return len(one_str)  # 가장 작은 자리수를 반환
        
        num += 1

# 여러 개의 테스트 케이스를 처리하는 부분
while True:
    try:
        n = int(input())
        result = find_smallest_multiple_one(n)
        print(result)
    except EOFError:  # 입력이 더 이상 없으면 종료
        break