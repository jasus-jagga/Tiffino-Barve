🐳 Tiffino-Barve – Project Command History
<br>
This document describes the step-by-step commands used to set up, build, and run the Tiffino-Barve application using Docker and Docker Compose.
<br>
1️⃣ Install Docker & Docker Compose
<br>
    sudo apt update
<br>
    sudo apt install -y docker.io docker-compose
    <br>
<br>
    sudo systemctl enable docker
<br>
    sudo systemctl start docker
<br>
    sudo usermod -aG docker $USER
<br>
    newgrp docker
<br>
<br>
ℹ️ newgrp docker applies Docker group permissions immediately without logging out.
<br>
2️⃣ Clone the Project Repository
<br>
    git clone https://github.com/jasus-jagga/Tiffino-Barve.git
<br>
    cd Tiffino-Barve
<br>
<br>
3️⃣ Build Backend Docker Image
<br>
   cd Tiffino
<br>
   docker build -t backendimage .
<br>
   cd ..
<br>
<br>
4️⃣ Build Frontend Docker Image
<br>
   cd frontend/Tiffino
<br>
   docker build -t frontendimage .
<br>
   cd ../..
<br>
<br>
5️⃣ Verify Docker Images
<br>
    docker images
<br>
<br>
Expected images:
<br>
   backendimage:latest
<br>
   frontendimage:latest
<br>
<br>
6️⃣ Start Application Using Docker Compose
<br>
    docker-compose up -d
<br>
<br>
7️⃣ Verify Running Containers
<br>
   docker ps
