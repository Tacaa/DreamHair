

insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (3, 3, 3);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (3, 3, 9);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (3, 9, 3);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (3, 9, 9);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (9, 3, 3);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (9, 3, 9);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (9, 9, 3);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (9, 9, 9);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (1, 1, 1);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (2, 2, 2);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (7, 7, 7);
insert into peh_values (proteins_percentage, emollients_percentage, humectans_percentage) values (2, 7, 2);

insert into review (rating, coments, list_of_ratings) values (5.0, 'Odlicno ulje!,Ja ga koristim za ljepsu kozu takodje!', '5,5,5');
insert into review (rating, coments, list_of_ratings) values (4.0, 'Skupo i tesko za naci!, Meni je pomoglo kosa mi je svilenkastija!', '5,5,2');
insert into review (rating, coments, list_of_ratings) values (4.66, 'Svako treba imati maslinovo ulje u kuci!', '5,5,4');
insert into review (rating, coments, list_of_ratings) values (1.33, 'Meni ne prija,Tesko je ulje,', '1,1,2');
insert into review (rating, coments, list_of_ratings) values (2.0, '', '2,2,2');
insert into review (rating, coments, list_of_ratings) values (4.5, 'Onako', '5,4');

insert into preparation (PREPARATION_TYPE, name, type, review_id) values ('OIL', 'Kokosovo ulje', 1, 1);
insert into preparation (PREPARATION_TYPE, name, type, review_id) values ('OIL', 'Shea maslac', 1, 2);
insert into preparation (PREPARATION_TYPE, name, type, review_id) values ('OIL', 'Maslinovo ulje', 2, 3);
insert into preparation (PREPARATION_TYPE, name, type, review_id) values ('OIL', 'Ricinusovo ulje', 2, 4);
insert into preparation (PREPARATION_TYPE, name, type, review_id) values ('OIL', 'Konopljino ulje', 3, 5);
insert into preparation (PREPARATION_TYPE, name, type, review_id) values ('OIL', 'Laneno ulje', 3, 6);


insert into review (rating, coments, list_of_ratings) values (5.0, 'Nema bolje maske!,Ja je obozavam!', '5,5,5');
insert into review (rating, coments, list_of_ratings) values (4.0, 'Odlicna,Okej je', '4,4');
insert into review (rating, coments, list_of_ratings) values (4.66, 'Kao sto ime kaze Wow', '5,5,4');
insert into review (rating, coments, list_of_ratings) values (1.33, 'Ne volim Balea proizvode!', '1,1,2');
insert into review (rating, coments, list_of_ratings) values (2.0, 'Nista posebno', '2,2,2');
insert into review (rating, coments, list_of_ratings) values (1.75, 'Onako', '5,4');

insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('MASK', 'Fructis Macadamia Hair Food', 1, 7);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('MASK', 'Ziaja organ i tsubaki oils', 2, 8);
insert into preparation (PREPARATION_TYPE, name, peh_values_id) values ('MASK', 'GLISS Babassau Nut Oil', 3);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('MASK', 'WOW Hair', 4, 9);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('MASK', 'SerieExpert Loreal', 5, 11);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('MASK', 'As I Am Coconut', 6, 12);
insert into preparation (PREPARATION_TYPE, name, peh_values_id) values ('MASK', 'Botanic Therapy Ginger', 7);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('MASK', 'Balea Honey', 8, 10);

insert into review (rating, coments, list_of_ratings) values (4.8, 'Dobar regenerator', '5,4,5');
insert into review (rating, coments, list_of_ratings) values (4.0, 'Odlicna,Okej je', '4,4');
insert into review (rating, coments, list_of_ratings) values (4.66, 'Kao sto ime kaze Wow', '5,5,4');
insert into review (rating, coments, list_of_ratings) values (1.33, 'Ne volim Balea proizvode!', '1,1,2');
insert into review (rating, coments, list_of_ratings) values (2.0, 'Nista posebno', '2,2,2');
insert into review (rating, coments, list_of_ratings) values (1.75, 'Onako', '5,4');

insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('REGENERATOR', 'inescto COCONUT', 1, 13);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('REGENERATOR', 'Yope Original Garden', 2, 14);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('REGENERATOR', 'Phitogilos ILLUMINANTE', 3, 15);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('REGENERATOR', 'Cantu Avocado', 4, 16);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('REGENERATOR', 'Fructis Oil Repair 3 Avocado', 5, 17);
insert into preparation (PREPARATION_TYPE, name, peh_values_id) values ('REGENERATOR', 'Botanic Therapy Ricinus', 6);
insert into preparation (PREPARATION_TYPE, name, peh_values_id) values ('REGENERATOR', 'Fructis Aloa Hydra Bomb', 7);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, review_id) values ('REGENERATOR', 'Balea Golden Milch', 8, 18);

insert into review (rating, coments, list_of_ratings) values (5.0, 'Odusevljena!!!,I meni je super!', '5,5,5,5');
insert into review (rating, coments, list_of_ratings) values (4.0, 'Odlicna,Okej je', '4,4');
insert into review (rating, coments, list_of_ratings) values (4.5, 'Superiska', '5,5,4');
insert into review (rating, coments, list_of_ratings) values (3.5, 'Srednje', '3,4');
insert into review (rating, coments, list_of_ratings) values (2.5, 'Nista posebno', '2,3');
insert into review (rating, coments, list_of_ratings) values (2.0, 'Moze bolje', '2,2');
insert into review (rating, coments, list_of_ratings) values (1.5, 'Ne svidja mi se,Neutralna', '1,3');
insert into review (rating, coments, list_of_ratings) values (1.0, 'Odvratan', '1');

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Alverde Locken Shampoo', 1, 0, 19);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Klorane Kopriva', 2, 0, 20);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Biobaza Kopriva', 3, 0, 23);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Woe Protein Shampoo', 4, 0, 24);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'BioElixir COCONUT', 5, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'UrteKram Tea Tree', 6, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'UrteKram Shampoo Rosemary', 7, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'UrteKram Calendula', 8, 0);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Dove Clarify and Hydrate', 1, 1, 21);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Bioderma Green', 2, 1, 22);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Babylove Mildes Shampoo', 3, 1, 25);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type, review_id) values ('DAILY_SHAMPOO', 'Gloria Sampon za rast kose', 4, 1, 26);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'Lumpi Sampon za bebe', 5, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'Afrodita baby', 6, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'Gallinee', 7, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_type) values ('DAILY_SHAMPOO', 'Herbal Essences Avocado', 8, 1);

insert into review (rating, coments, list_of_ratings) values (5.0, 'Odusevljena!!!,I meni je super!', '5,5,5,5');
insert into review (rating, coments, list_of_ratings) values (4.0, 'Odlicna,Okej je', '4,4');
insert into review (rating, coments, list_of_ratings) values (4.5, 'Superiska', '5,5,4');
insert into review (rating, coments, list_of_ratings) values (3.5, 'Srednje', '3,4');
insert into review (rating, coments, list_of_ratings) values (2.5, 'Nista posebno', '2,3');
insert into review (rating, coments, list_of_ratings) values (2.0, 'Moze bolje', '2,2');
insert into review (rating, coments, list_of_ratings) values (1.5, 'Ne svidja mi se,Neutralna', '1,3');
insert into review (rating, coments, list_of_ratings) values (1.0, 'Odvratan', '1');
insert into review (rating, coments, list_of_ratings) values (4.9, 'Odusevljena!!!,I meni je super!', '5,5,5,5');
insert into review (rating, coments, list_of_ratings) values (3.0, 'Odlicna,Okej je', '4,4');
insert into review (rating, coments, list_of_ratings) values (4.5, 'Superiska', '5,5,4');
insert into review (rating, coments, list_of_ratings) values (3.5, 'Srednje', '3,4');
insert into review (rating, coments, list_of_ratings) values (2.8, 'Nista posebno', '2,3');
insert into review (rating, coments, list_of_ratings) values (2.4, 'Moze bolje', '2,2');
insert into review (rating, coments, list_of_ratings) values (1.7, 'Ne svidja mi se,Neutralna', '1,3');
insert into review (rating, coments, list_of_ratings) values (1.3, 'Odvratan', '1');

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Fushi', 1, 0, 0, 27);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Tvrdi sampon Zob Oats', 2, 0, 0, 28);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Natura Siberica Hydrolate', 3, 0, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Tropical Coconut Shea', 4, 0, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Nature box Avocado', 5, 0, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Balea Spliss Protection', 6, 0, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Design KEUNE', 7, 0, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Olival Ricinus', 8, 0, 0);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Oblepikha Siberica Lavanda', 1, 0, 1, 29);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Kerastase Green', 2, 0, 1, 30);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Ziaja', 3, 0, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Precious Argan', 4, 0, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Fructis Banana Hair Food', 5, 0, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Fructis Aloa Hydra Bomb', 6, 0, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Ahuhu Hyaluron', 7, 0, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Balea More Blond', 8, 0, 1);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Botanic Therapy Ginger Recovery', 1, 0, 2, 31);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Alpecin Coffee Shampoo', 2, 0, 2, 32);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Guhl Frische Lemon', 3, 0, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Panten Lift Volume', 4, 0, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Panten Aqua Light', 5, 0, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Olival Kopriva', 6, 0, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Acidosalus', 7, 0, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Klorane', 8, 0, 2);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Syod pure Volume', 1, 1, 0, 33);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Alverde Anti-fett Shampoo', 2, 1, 0, 34);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Balance Shampoo', 3, 1, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Afrodita Cesen Shampoo', 4, 1, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Vitalizing De C Tuha', 5, 1, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Elseve Clay', 6, 1, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Elseve Dream long', 7, 1, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Alverde Kiwi', 8, 1, 0);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Fructis Aloa Vera', 1, 1, 1, 35);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Pantene Aqua Light', 2, 1, 1, 36);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Pantene Lift Volume', 3, 1, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Balea Shampoo', 4, 1, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Ausie Sos Deep Repair', 5, 1, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Lacroa Herbalic', 6, 1, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Tvrdi Sampon Limun i lavanda', 7, 1, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Syod pure Volume', 8, 1, 1);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Botanic Therapy Ginger Recovery', 1, 1, 2, 37);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Panten Aqua Light', 1, 1, 2, 38);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Klorane', 1, 1, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Oblepikha Siberica Lavanda', 1, 1, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Lacroa Herbalic', 1, 1, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Elseve Clay', 1, 1, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Alverde Kiwi', 1, 1, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Pantene Lift Volume', 1, 1, 2);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Fushi', 1, 2, 0, 39);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Tvrdi sampon Zob Oats', 1, 2, 0, 40);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Natura Siberica Hydrolate', 1, 2, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Tropical Coconut Shea', 1, 2, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Nature box Avocado', 1, 2, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Balea Spliss Protection', 1, 2, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Design KEUNE', 1, 2, 0);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Olival Ricinus', 1, 2, 0);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Syod pure Volume', 1, 2, 1, 41);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity, review_id) values ('DEEP_WASH_SHAMPOO', 'Alverde Anti-fett Shampoo', 2, 2, 1, 42);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Balance Shampoo', 3, 2, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Afrodita Cesen Shampoo', 4, 2, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Vitalizing De C Tuha', 5, 2, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Elseve Clay', 6, 2, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Elseve Dream long', 7, 2, 1);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Alverde Lemon', 8, 2, 1);

insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Botanic Therapy Ginger Recovery', 1, 2, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Alpecin Coffee Shampoo', 1, 2, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Guhl Frische Lemon', 1, 2, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Panten Lift Volume', 1, 2, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Panten Aqua Light', 1, 2, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Olival Kopriva', 1, 2, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Klorane', 1, 2, 2);
insert into preparation (PREPARATION_TYPE, name, peh_values_id, scalp_sensitivity, shampoo_intensity) values ('DEEP_WASH_SHAMPOO', 'Acidosalus', 1, 2, 2);


insert into preparations (current, date_of_recommendation) values (true, '2022-06-24 02:07:10.062');

insert into preparations_oil (preparations_id, oil_id) values (1, 3);
insert into preparations_oil (preparations_id, oil_id) values (1, 4);

insert into preparations_mask (preparations_id, mask_id) values (1, 7);

insert into preparations_regenerator (preparations_id, regenerator_id) values (1, 15);

insert into preparations_ds (preparations_id, ds_id) values (1, 31);
insert into preparations_ds (preparations_id, ds_id) values (1, 33);

insert into preparations_dws (preparations_id, dws_id) values (1, 45);
insert into preparations_dws (preparations_id, dws_id) values (1, 59);



insert into preparations (current, date_of_recommendation) values (true, '2022-06-22 02:07:10.062');

insert into preparations_oil (preparations_id, oil_id) values (2, 1);
insert into preparations_oil (preparations_id, oil_id) values (2, 2);

insert into preparations_mask (preparations_id, mask_id) values (1, 10);

insert into preparations_regenerator (preparations_id, regenerator_id) values (1, 18);

insert into preparations_ds (preparations_id, ds_id) values (1, 29);
insert into preparations_ds (preparations_id, ds_id) values (1, 37);

insert into preparations_dws (preparations_id, dws_id) values (1, 58);
insert into preparations_dws (preparations_id, dws_id) values (1, 63);


insert into diary (hair_wash, hair_growth, hair_state, comments) values ('1,2,2,3,3,1', '1,2,1.5', '2,3,4', 'Krecem sa njegom,Kosa mi se poboljsala,Kosa je neprepoznatljiva');
insert into diary (hair_wash, hair_growth, hair_state, comments) values ('2,3,2,1,2,3,2,3,1', '1.2,1.7,2,1,2,1.5', '0,1,2,2,3,4', 'Kosa mi je odvratna,Jos uvijek je suha,Krecem sa njegom,Ne vidim neke rezultate,Kosa mi se poboljsala,Kosa je neprepoznatljiva');

insert into advice (score) values (100);
insert into advice (score) values (600);

insert into role (name) values ('ROLE_ADMIN');
insert into role (name) values ('ROLE_REGISTERED_USER');

insert into users (USER_TYPE, username, password, name, last_name, enabled) values ('ADMIN', 'taca', '$2a$10$kuG.m.KvcrNFEew/63ldyOp2Lkf.PNIOs0JKkWdR2lW9EhxlyJsuW', 'Tatjana', 'Gavrilovic', true);
insert into users (USER_TYPE, username, password, name, last_name, enabled, preparations_id, diary_id, advice_id) values ('REGISTERED_USER', 'ana', '$2a$10$zQFFPAKIA8NjiFlgV7aOHO5vQGC5/NOp8uk6qilpayB0sNU.9xHrO', 'Ana', 'Gavrilovic', true, 1, 1, 1);
insert into users (USER_TYPE, username, password, name, last_name, enabled, preparations_id, diary_id, advice_id) values ('REGISTERED_USER', 'ema', '$2a$10$vCYmhOnbBmj2sgAi8/DJFOVx.Z2JyRITwFINV8VINaG.U5ZR6uNxi', 'Ema', 'Mihajlovic', true, 2, 2, 2);


insert into user_role (user_id, role_id) values (1, 1);
insert into user_role (user_id, role_id) values (2, 2);
insert into user_role (user_id, role_id) values (3, 2);




