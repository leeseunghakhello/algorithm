n = int(input())

board = [list(input()) for _ in range(n)]

def check(board):
    count = 0
    for i in range(n):
        cnt = 1
        for j in range(1, n):
            if board[i][j] == board[i][j-1]:
                cnt += 1
            else:
                count = max(count, cnt)
                cnt = 1
        count = max(count, cnt)

    for i in range(n):
        cnt = 1
        for j in range(1, n):
            if board[j][i] == board[j-1][i]:
                cnt += 1
            else:
                count = max(count, cnt)
                cnt = 1
        count = max(count, cnt)
    return count

answer = 0
for i in range(n):
    for j in range(n):
        if j + 1 < n:
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j]
            temp = check(board)
            answer = max(answer, temp)
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j]
        
        if i + 1 < n:
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]
            temp = check(board)
            answer = max(answer, temp)
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]

print(answer)
