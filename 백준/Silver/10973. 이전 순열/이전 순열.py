n = int(input())
seq = list(map(int, input().split()))

def prev_permutation(seq):
    i = len(seq) - 1
    while i > 0 and seq[i-1] <= seq[i]:
        i -= 1
    if i == 0:
        return False

    j = len(seq) - 1
    while seq[j] >= seq[i-1]:
        j -= 1

    seq[i-1], seq[j] = seq[j], seq[i-1]
    seq[i:] = reversed(seq[i:])
    return True

if prev_permutation(seq):
    print(*seq)
else:
    print(-1)
