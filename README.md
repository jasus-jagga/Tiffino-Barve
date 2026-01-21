�
� Tiffino-Barve – Project Command History (Final) 
1
️. Install Docker & Docker Compose 
sudo apt update 
sudo apt install -y docker.io docker-compose 
sudo systemctl enable docker 
sudo systemctl start docker 
sudo usermod -aG docker $USER 
newgrp docker
2
️. Clone the Project Repository 
git clone https://github.com/jasus-jagga/Tiffino-Barve.git 
cd Tiffino-Barve 
3
️. Build Backend Docker Image 
cd Tiffino 
docker build -t backendimage . 
cd .. 
4
️. Build Frontend Docker Image 
cd frontend/Tiffino 
docker build -t frontendimage . 
cd ../.. 
5
️. Verify Docker Images 
docker images 
6
️. Start Application Using Docker Compose 
docker-compose up -d 
7
️. Verify Running Containers 
docker ps
