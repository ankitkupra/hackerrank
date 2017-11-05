n = int(input())
m = set(map(int,input().split()))
command = int(input())
for i in range(command):
    k = []
    k = input().split()
    if k[0] == 'pop':
        m.pop()
    elif k[0] == 'remove':
        m.remove(int(k[1]))
    elif k[0] == 'discard':
        m.discard(int(k[1]))
    else:
        print('not a commamd')

print(sum(m))
