----Docker file and basic commands

1) docker ps -a _ checking all containers


2) docker ps _ checking already running container


3) docker images_checking installed images

4) docker image rm {id or name}_Deleting image


5) docker container rm {id or name)_Deleting container

6) docker build . _Building Docker fail which on is inside of current folder or project

7) docker run --name carina-demo -it --entrypoint /bin/bash carina-demo-mvn  __ Creating container and run it as well

8) docker logs {container name}_Displaying logs of container

9) docker exec -it {container name} bash _to get into container and then navigate in container as in regular linux
   machine

----Docker compose

1) docker compose up _ compose docker file creating container and imagines too

2) docker compose down _ restart compose
