dwarfs = [int(input()) for _ in range(9)]

def find_seven_dwarfs(dwarfs):
    total = sum(dwarfs)
    
    for i in range(9):
        for j in range(i+1, 9):
            if total - dwarfs[i] - dwarfs[j] == 100:
                dwarfs.remove(dwarfs[i])
                dwarfs.remove(dwarfs[j-1])  # i번째 원소가 먼저 삭제되었기 때문에 j-1
                return dwarfs

dwarfs = find_seven_dwarfs(dwarfs)
dwarfs.sort()

for dwarf in dwarfs:
    print(dwarf)
