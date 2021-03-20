number_of_streams = int(input())
water_flow = []
# streams are left to right
while True:
  flow = int(input())
  if flow == 99:
    stream_split = int(input()) - 1
    percentage_split = int(input()) / 100
    # percentage_split is the amount split to the left
    left_fork = water_flow[stream_split] * percentage_split
    right_fork = water_flow[stream_split] * (1 - percentage_split)
    water_flow.insert(stream_split, left_fork)
    water_flow[stream_split+1] = right_fork
  elif flow == 88:
    stream_joined = int(input()) - 1
    #stream_joined is joined with the right stream
    water_flow[stream_joined + 1] += water_flow[stream_joined]
    del water_flow[stream_joined]
  elif flow == 77:
    break
  else:
    water_flow.append(flow)
for x in range(len(water_flow)):
  print(water_flow[x], "", end="")