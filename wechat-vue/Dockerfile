FROM node:lts as build-stage

WORKDIR /app

COPY package*.json ./

RUN npm install
RUN npm install yarn

COPY . .

RUN yarn run build

EXPOSE 80

FROM nginx:stable

COPY --from=build-stage /app/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]