def solution(param0):
    answer = []
    
    file_dic = {}
    for p in param0:
        file = list(p.split("/"))[-1]
        f_name = file[0] + "." + file[-1]

        # 빈도수 딕셔너리에 저장
        if f_name in file_dic:
            file_dic[f_name] += 1
        else:
            file_dic[f_name] = 1

    #2개 이상 answer에 저장
    for k, v in file_dic.items():
        if v > 1:
            answer.append(k)
            answer.append(v)

    return answer