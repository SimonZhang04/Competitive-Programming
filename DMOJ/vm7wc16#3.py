neighbourhood = input().split(" ")
num_houses = int(neighbourhood[0])
num_roads = int(neighbourhood[1])
start = int(neighbourhood[2])
end = int(neighbourhood[3])
graph={

}
for i in range(num_houses+1):
    graph[i] = []
for x in range(num_roads):
  road = list(map(int,input().split()))
  graph[road[0]].append(road[1])
  graph[road[1]].append(road[0])

def bfs(start, end, graph):
  visited = [False for i in range(num_houses+1)] # n is the amount of nodes
  queue = [start] # the node we start at
  visited[start] = True
  while queue: # while the queue has elements
    cur = queue.pop(0) #take the leftmost element
    if cur == end:
      return True
    for z in graph[cur]: #for each element connected to our current node
      if not visited[z]:
        queue.append(z) # add the node to our queue
        visited[z] = True # add it to visited
  return False

if bfs(start, end, graph):
  print("GO SHAHIR!")
else:
  print("NO SHAHIR!")