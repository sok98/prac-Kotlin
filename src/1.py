def check(arr):
    answer = []
    ch = [0 for _ in range(max(arr)+1)]
    for i in arr:
        ch[i] += 1

    for c in ch:
        if c > 1:
            answer.append(c)

    if not answer:
        answer.append(-1)

    return answer


print(check([1, 2, 3, 3, 3, 3, 4, 4]))
print(check([3, 2, 4, 4, 2, 5, 2, 5, 5]))
print(check([3, 5, 7, 9, 1]))
