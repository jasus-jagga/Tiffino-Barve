🐳 Tiffino-Barve – Project Command History

This document describes the step-by-step commands used to set up, build, and run the Tiffino-Barve application using Docker and Docker Compose.

1️⃣ Install Docker & Docker Compose
<br>
sudo apt update
<br>
sudo apt install -y docker.io docker-compose
sudo systemctl enable docker
sudo systemctl start docker
sudo usermod -aG docker $USER
newgrp docker


ℹ️ newgrp docker applies Docker group permissions immediately without logging out.

2️⃣ Clone the Project Repository
git clone https://github.com/jasus-jagga/Tiffino-Barve.git
cd Tiffino-Barve

3️⃣ Build Backend Docker Image
cd Tiffino
docker build -t backendimage .
cd ..

4️⃣ Build Frontend Docker Image
cd frontend/Tiffino
docker build -t frontendimage .
cd ../..

5️⃣ Verify Docker Images
docker images


Expected images:

backendimage:latest

frontendimage:latest

6️⃣ Start Application Using Docker Compose
docker-compose up -d

7️⃣ Verify Running Containers
docker ps
