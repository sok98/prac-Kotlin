def solution(info, query):
    answer = []
    
    new_info = []
    for i in info:
        p = list(i.split(" "))
        new_info.append(p)
        
    for q in query:
        result = [1 for _ in range(len(new_info))]
        con = list(q.replace(" and ", " ").split(" "))
        print(con)

        for c in range(len(con)):
            if con[c] != "-":
                if con[c].isdigit():
                    for i in range(len(new_info)):
                        if result[i] == 1 and int(con[c]) > int(new_info[i][c]):
                            result[i] = 0
                else:
                    for i in range(len(new_info)):
                        if result[i] == 1 and con[c] != new_info[i][c]:
                            result[i] = 0
                
        answer.append(sum(result))
        
    return answer