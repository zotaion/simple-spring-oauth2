DROP TABLE IF EXISTS beer;

CREATE TABLE beer (
  id INTEGER AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  image VARCHAR(250) NOT NULL
);

INSERT INTO beer (name, image) VALUES
  ('Lager', 'https://www.allagash.com/wp-content/uploads/Allagash-Ale-Lager-Blog-1-4.jpg'),
  ('Ale', 'https://cdn2.justwineapp.com/assets/article/2017/05/have-a-pint-beer-free-image-stock-photos-creative-commons-lager-cold.jpg'),
  ('Dark', 'https://cdn.craftbeer.com/wp-content/uploads/Debunking-the-Myths-Surrounding-Dark-Beer2-hero.jpg');
