import random

city_count = int(input("Enter City Count: "))
n_cities = 4  # The TSP with 4 cities

# Task 1
def create_matrix(cities):
    # Define matrix
    adjacency_matrix = [[0 for x in range(cities)] for y in range(cities)]

    # Fill with data
    #    for i in range(cities):
    #        for j in range(cities):
    #            if i != j:
    #                distance = int(input(f"Enter distance between city {i} and {j}: "))
    #                adjacency_matrix[i][j] = distance
    #            else:
    #                adjacency_matrix[i][j] = 0

    adjacency_matrix = [
        [0, 20, 42, 35],
        [20, 0, 30, 34],
        [42, 30, 0, 12],
        [35, 34, 12, 0]
    ]

    return adjacency_matrix

# Task 2
def evaluate_tsp(adjacency_matrix, route):
    total_cost = 0
    # Go through cities in route
    for i in range(len(route) - 1):
        current_city = route[i]
        next_city = route[i + 1]
        total_cost += adjacency_matrix[current_city][next_city]
    
    # Go back to start
    total_cost += adjacency_matrix[route[-1]][route[0]]
    return total_cost

def create_route():
    route = list(map(int, input("Enter the route with spaces separating the numbers, like '0 1 2 3': ").strip().split()))
    return route

# Task 3
def random_route(n_cities):
    random_route_num = int(input("Enter number of random routes you want to generate: \n"))
    for i in range(random_route_num):
        route = list(range(n_cities))
        random.shuffle(route)
        print(f"Random Route {i+1}: {route}, cost (including return): {evaluate_tsp(adjacency_matrix, route)}")
    return route

if __name__ == "__main__":
    adjacency_matrix = create_matrix(city_count)
    route = create_route()
    cost = evaluate_tsp(adjacency_matrix, route)

    # get random route and its cost
    route_random = random_route(n_cities)
    random_cost = evaluate_tsp(adjacency_matrix, route_random)
    
    #for row in adjacency_matrix:
    #    print(row)
    print("\nInput Route:", route)
    print("Total Cost (including return):", cost)
    print("\nRandom Route:", route_random)
    print("Total Random Cost (including return):", random_cost)