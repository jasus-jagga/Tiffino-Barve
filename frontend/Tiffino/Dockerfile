# ---------- Build Stage ----------
FROM node:18-alpine AS build
 
WORKDIR /app
 
COPY package.json package-lock.json ./
RUN npm install
 
COPY . .
RUN npx ng build --configuration production
 
# ---------- Nginx Stage ----------
FROM nginx:alpine
 
# Browser folder copy
COPY --from=build /app/dist/tiffino/browser /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
 
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
