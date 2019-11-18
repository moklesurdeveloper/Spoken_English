package com.spokenenglish.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.spokenenglish.spokenenglish.Class.DetailsInfo;
import com.spokenenglish.spokenenglish.Class.HomeInfo;
import com.spokenenglish.spokenenglish.adapter.DetailsAdapter;
import com.spokenenglish.spokenenglish.adapter.HomeAdapter;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private RecyclerView recyclerDetails;
    int index = 0;
    private String[][] wordList = {new String[]{"Good morning Mother :\nশুভ সকাল সকাল মা।", "Good afternoon grandmother :\nশুভ বিকাল দিদিমা।", "Good night :\nশুভ রাত্রি।", "Good by :\nবিদায়।", "See you again :\nআবার দেখা হবে।", "Please :\nদয়া করে।", "Welcome :\nস্বাগতম।", "Sorry :\nদুঃখিত।", "Thanks :\nধন্যবাদ।", "With great pleasure :\nঅত্যন্ত আনন্দের সাথে।", "Excuse me :\nআমাকে মাফ করবেন।", "No mention :\nকোনো ব্যপার না।", "Some body come here :কেউ এখানে এসো ।\n", "They are not good friends :\nওরা ভালো বন্ধু নয় ।", "I don’t know him :\nআমি তাকে চিনি না ।", "He is not eating :\nসে খাচ্ছে না ।", "Rasel was not there :\nরাসেল সেখানে ছিল না ।", "I shall wait until you come back :\nতুমি যতক্ষণ না ফের, ততক্ষণ আমি অপেক্ষা করব।", "What’s the time :\nকয়টা বাজে ?", "You mind your business :\nআপনি নিজের কাজ করুন ।", "What is the time by your watch ? :\nআপনার ঘড়িতে এখন কয়টা বাজে ?", "Are you coming or not ? :\nআপনি আসবেন কি আসবেন না ?", "Who will help him ? :\nতাকে কে সাহায্য করবে ?", " I’ll go tomorrow :\nআমি আগামি কাল যাবো ।", " We aren’t sure :\nআমরা নিশ্চিত নই ।", "I shall finish my work by Sunday :\nরবিবারের মধ্যে আমি আমার কাজ শেষ করবো ।", "I don’t take tea :\nআমি চা পান করি না ।", "Just coming. :\nআমি এই এসেছি", "Very well. :\nবেশ/খুব ভালো", "Its fine./ Very good. :\nঠিক আছে", "As you like./As you please. :\nআপনি যা বলেন/আপনার যা ইচ্ছা", "Anything else? :\nআর কিছু?"}, new String[]{"who is coming :\nকে আসছে", "what is the menu for dinner?  :\n রাতে কি রান্না হয়েছে   ?", "where we will meet ? :\nআমরা কোথায় দেখা করবো ?", "The more I love you :\nআমি যত বেশি ভালোবাসি তোমায় |", "The more I want to love you :\nতার চেয়েও বেশি ভালোবাসতে চাই |", "The more close I come to you :\nআমি যত বেশি কাছে আসি তোমার |", "The more close I want to come :\nতার চেয়েও বেশি কাছে আসতে চাই |", "Give me a hug with love :\n ভালোবেসে আমাকে নাও জড়িয়ে |", "Make me colored with the touch of your love :\nতোমার প্রেমের ছোয়াতে দাও রাঙিয়ে |", "Sunshine of the morning awakes me everyday :\nসকালের সোনা রোদ প্রতিদিন আমার ঘুম ভাঙ্গায়|", "Opening the eyes my heart wants your touch :\nচোখ মেলে এ হৃদয় তোমারি পরশ চায় |", "You cooled my mind down with the frost air :\nহিমেল হাওয়াতে এ মন জুড়ালে গো হায় |", "Even though my heart not refreshed if I donot get you close :\nতবু এ মন জুড়ায় না তো যদি কাছে না পাই তোমায় |"}, new String[]{"What the hell are you talking? :\nকি যা তা বলতেছো?", "How beautiful you are! :\nতুমি কত সুন্দর!", "You are in my breath :\nনিশ্বাস আমার তুমি", "My heart is only for you :\nহৃদয় শুধু তোমার জন্য ", "Give to take :\nকিছু পেতে হলে কিছু দিতে হয়", "Out of sight, out of mind :\nচোখের আড়াল মানে মনের আড়াল", "Don't get mad :\nবোকামী করোনা !", "What a pleasant surprise! :\nকি দারুণ চমক !", "My Goodness :\nহায় আল্লাহ্ !", "That's all nonsense :\nসব বাজে কথা", "What a nuisance! :\n কি আপদ !", "But who cares? :\nকে ধারধারে?", "Question does not arise :\nপ্রশ্নই উঠে না ", "Worthless! :\nঅপদার্থ কোথাকার", "Not at all :\nমোটেও নয়", "Go to the devil :\nগোল্লায় যাক"}, new String[]{"Don't be impractical :\nধৈর্য্য হারা হয়ো না", "Don't break the rules :\nনিয়ম ভঙ্গ কর না", "Don't get excited :\n উত্তেজিত হয়ো না", "Don't give it to me :\nআমার কাছে ইহা দিও না", "Don't lose control :\n নিয়ন্ত্রণ হারিয়ে ফেলো না", "Don't lose touch :\nযোগাযোগ রেখ/ ভুলে যেও না,", "Don't make me do it :\nআমাকে দিয়ে এ কাজ করিও না,", "Don't move so much :\n খুব ঘোরাঘুরি করো না", "Don't talk big :\nলম্বা কথা বলো না", "Don't think for me :\nআমার জন্য চিন্তা করো না", "Don't waste your time :\nসময় নষ্ট করো না,", "You are always welcome  :\nযখন খুশি আসবেন"}, new String[]{"What more can I say besides this? :\nএছাড়া আমি আর কি করতে পারি", "I feel rather dizzy :\nআমার মাথা ঝিমঝিম করছে", "I shall enquire after you every month :\nমাসে মাসে আমি তোমার খবর নিব", "To which party does he belong? :\nসে কোন পক্ষীয় লোক", "The rich alone are happy :\nধনী লোকেরাই সুখী", "Feed the young boys :\nছোট ছোট ছেলেদের খেতে দাও", "The exam will begin in the early part of January :\nজানুয়ারি মাসের প্রথমে পরীক্ষা শুরু হবে", "Either take it or leave it :\nহয় ইহা গ্রহণ কর নয় বর্জন কর"}, new String[]{" As brisk as butterfly  :\nপ্রজাপতির মত চঞ্চল", "As busy as bee  :\nমৌমাসির মত ততপর", " As brave as lion :\nশিংহের মত সাহসী", "As clear as day  :\nদিনের আলোর মত পরিস্কার", "As cunning as a fox  :\nশেয়ালের মত ধুর্ত", "As fair as a rose  :\nগোলাপের মত সুন্দর", "As fierce as a tiger  :\nবাঘের মত ভয়ংকর", " As free as air  :\nবাতাসের মত স্বাধীন", "As fresh as a rose  :\nগোলাপের মত সতেজ", "As grave as a judge :\nবিচারকের মত গম্ভীর", "As greedy as wolf  :\nনেকড়ের মত লোভী", "As hoarse as crow  :\nকাকের মত কর্কশ", "As light as feather  :\nপালকের মত হালকা", "As playful as kitten  :\nবিড়াল ছানার মত ক্রীড়ামোদী", "As silly as sheep  :\nখরগোশের মত বোকা"}, new String[]{"Can you speak English? :\nতুমি কি ইংরেজি বলতে পার?", " Do you study English? :\nতুমি কি ইংরেজি পড়?", "Opinions differ on this subject :\nএ বিষয়ে মতভেদ আছে।", "I have left no stone unturned :\nআমি চেষ্টার আর কিছু বাকি রাখিনি।", "One shallow does not make a summer :\nএক মাঘে শীত যায় না।", " It takes two to make a quarrel :\nএক হাতে তালি বাজে না।", "You are a man after my heart :\nতুমি আমার মনের মানুষ।", "Have it your way :\n.তোমার যেভাবে ইচ্ছা সেভাবে কর।", "Are you getting me? :\nআমার কথা কি বুঝতে পারছো?", "Do you take credit cards? :\nতুমি ক্রেডিট কার্ডে দাম নাও?", "Do you think it'll rain today? :\nতোমার কি মনে হয় আজ বৃষ্টি হবে?", "Do you think it's possible? :\nতুমি কি মনে কর এটা সম্ভব?", "Do you think you'll be back by 11:30? :\nতোমার কি মনে হয় কাল সাড়ে এগারটার মধ্যে ফিরতে পারবে ?", "Do you understand? :\nতুমি বুঝতে পারছ?"}, new String[]{"Give me a hand. :\nআমাকে একটু সাহায্য করো।", "Let me do it myself. :\nআমাকে একাই করতে দাও।", "It's a wonder for me :\nএটা আমার জন্য একটা বিস্ময়। ", "Can you guess what I'm gonna tell you now? :\nভাবতে পারো এখন আমি তোমাকে কি বলবো?", "So far so good. :\nএ পর্যন্ত ভালই চলছে।", "Pen through the second line. :\nদ্বিতীয় লাইনটা কেটে দাও।", "His name has been struck off. :\nতার নাম কাটা গেল।", "He is having a very hard time. :\nতিনি বড় কষ্টে সময় কাটাচ্ছেন।", "The fire has blazed up. :\nআগুন জ্বলে উঠেছে।", "Where do you put up? :\nতুমি কোথায় থাক?"}, new String[]{"How many ?  :\nকতগুলো ?", "How much ?  :\n কি পরিমাণ ?", "How often  ? :\nকতদিন ? / কত সময় পর ?", "How far ? :\nকতদূর ?", "How fare ? :\nকত ভাড়া ?", "How long ? :\nকতক্ষণ ?", "How fast ? :\nকত দ্রুত ?", "How dare ? :\nকোন সাহসে ?", "How much longer ?  :\nআর কতক্ষণ ?", "How quickly :\nকত দ্রুত ?"}, new String[]{"Eat  :\nখাওয়া", "Drink  :\nপান করা", "Suck :\nচুষে খাওয়া", "Lick :\nলেহন করা বা চাটা,", "Bite  :\nকামড়ানো,", "Swallow :\nগিলে ফেলা", "Sip :\nচুমুক দেওয়া", "Taste  :\nআস্বাদন করা,", "Chew :\nচিবানো,", "Bite off  :\nকামড়ে ছিঁড়ে নেওয়া,", "Eat voraciously :\nগোগ্রাসে খাওয়া,", "Eat like a bird :\nঅল্পখাওয়া,", "Throw up  :\nবমি করা,", "Eat too much :\nঅত্যধিক আহার করা", "Vegetarian :\nনিরামিষভোজী,", "Breakfast :\nসকালের নাস্তা,", "Lunch :\nদুপুরের খাবার,", "Dinner :\nরাতের খাবার", "Supper :\n দিনের শেষ খাবার", "Feast :\nআনন্দময় ভোজ", "Starve :\n অনাহারে কাটানো", "Fast :\nরোজা রাখা", "Overeat :\nপরিমাণে বেশী খাওয়া", "Go without food :\nনা খেয়ে থাকা।"}, new String[]{"Don't be impractical :\nধৈর্য্য হারা হয়ো না,", "Don't break the rules :\nনিয়ম ভঙ্গ কর না", "Don't get excited :\nউত্তেজিত হয়ো না", "Don't give it to me  :\nআমার কাছে ইহা দিও না", "Don't lose control :\nনিয়ন্ত্রণ হারিয়ে ফেলো না", "Don't lose touch :\nযোগাযোগ রেখ/ ভুলে যেও না", "Don't make me do it :\nআমাকে দিয়ে এ কাজ করিও না", "Don't move so much :\n খুব ঘোরাঘুরি করো না", "Don't talk big  :\nলম্বা কথা বলো না", "Don't think for me  :\nআমার জন্য চিন্তা করো না", "Don't waste your time :\nসময় নষ্ট করো না", "You are always welcome :\nযখন খুশি আসবেন"}, new String[]{"Man becomes beautiful by character :\nচরিত্র দ্বারাই মানুষ সুন্দর হয়।", "White or fair isn't meant beautiful :\nসাদা বা ফর্সা মানেই কিন্তু সুন্দর নয়।", "And black isn't meant ill shaped :\nআর কালো মানেই কিন্তু কুৎসিত নয়।", "Enshrouding cloth is white but blatant :\nকাফনের কাপড় সাদা কিন্তু ভয়ানক।", "Kabaghar is black but wonderful :\nকাবা ঘর কালো কিন্তু অপরূপ।", "Men's beauty is not outer views :\nমানুষের সৌন্দর্য বাহ্যিক দৃশ্যে নয়।"}, new String[]{"If you fall asleep thinking of me :\nঘুমিয়ে পড় যদি আমায় ভেবে", "If you float on a dream seeing me :\nস্বপ্নে ভাসো যদি আমায় দেখে", "If you keep me in your mind :\nহৃদয় মাঝে যদি রাখো গো আমায়", "Being the morning bird I will sing a song for you :\nভোরের পাখি হয়ে গান শোনাব তোমায়", "In the solitude covered with green :\nসবুজে ছাওয়া এই নির্জনতায়", "Love me a little more :\nএকটু আরো ভালোবাসো না আমায়", "with your soggy lips me :\nসিক্ত তোমার ঐ অধরে আমায়", "Touch me with the touches of love :\nদাও না ছুঁয়ে ওগো প্রেমের ছোঁয়ায়", "If you let me come to close :\nনিভির করে যদি রাখো গো আমায়", "Being the morning bird I will sing a song for you :\nভোরের পাখি হয়ে গান শোনাব তোমায়", "If your eyes shed tears :\nদু’চোখ ঝরে যদি অশ্রুধারায়", "If your sight get lost by the shadow of grief :\nদৃষ্টি হারায় যদি বিষাদ ছায়ায়", "Forgetting the sad memories far away :\nদুঃখ স্মৃতি ভুলে দূর অজানায়", "Find out me in your happiness :\nসুখের মাঝে খুঁজে নিও গো আমায়", "If you hold me tight in your arms :\nবুকেতে জড়িয়ে যদি রাখো গো আমায়", "Being the morning bird I will sing a song for you :\nভোরের পাখি হয়ে গান শোনাব তোমায়"}, new String[]{"I Don't believe any girl anymore :\nআমি আর কোনো মেয়েকে বিশ্বাস করিনা।", "I wanted a pure Love :\nএকটা নির্ভেজাল ভালবাসা চেয়েছিলাম।", "However :\nযাই হউক", "May I say something? :\nআমি কিছু বলতে পারি?", "Don't worry about me :\nআমার জন্য চিন্তিত হবেন না।", "We are grateful to you :\nআমরা আপনার প্রতি ঋণি।", "Please stay a little more :\nআরো একটু থাকুন", "Thank you for your good advice :\nআপনার উত্তম উপদেশের জন্য ধন্যবাদ।", "I am at your service :\nআমি আপনার সেবায় আছি।", "Excuse me for the trouble :\nকষ্টের জন্য ক্ষমা চাইছি।"}, new String[]{" I have been taken aback at your conduct :\nতোমার আচরণ দেখে আর্শ্চাযান্বিত হয়েছি।", " I don't care for a man of straw like you :\nতোমার মত অপদার্থকে কেয়ার করিনা।", "What a pest :\nকি যন্ত্রণা?", "How dare you act so :\nতুমি কিভাবে এরূপ করতে সাহস কর?", "Are you not ashamed of your conduct :\nতুমি কি তোমার ব্যবহারের জন্য লজ্জিত নও?", "Shame on you :\nধিক তোমাকে!", "When will you come to your sense :\nকবে তোমার বুদ্ধি হবে?", "It is you who are to blame :\nতুমীই দোষী।", "you are good for nothing :\nতুমি কোন কাজের নও।", "Will you be quiet :\nআপনি শান্ত হতে হবে"}, new String[]{"You are the twinkle of eyes :\nতুমি আমার চোখের পলক", "The smile of my lips :\nআমার ঠেটের হাসি", "The joy of my face :\nআমার মুখের আনন্দ", "Without you I am incomplete :\nতুমি ছাড়া আমি অসম্পূর্ণ", "That is why I care for you :\nসে জন্য আমি তোমার ধার ধারি", "Please come in :\nঅনুগ্রহকরে ভেতরে আসুন", "Please count this for me :\nঅনুগ্রহকরে একটু গণনা করে দিবেন?", "Please fill out this form :\nঅনুগ্রহকরে ফরমটি ফিলআপ করুন", "Please sit down :\nঅনুগ্রহকরে বসুন", "Please speak English :\nঅনুগ্রহকরে ইংরেজিতে বলুন", "Please speak more slowly :\nঅনুগ্রহকরে একটু ধীরে বলুন"}, new String[]{"One thorn drives away another :\nকাঁটা দিয়ে কাঁটা তোলা।", "Shallow knowledge turns one's head :\nঅল্পবিদ্যা ভয়ঙ্করী।", "Look before you leap :\nদেখে শুনে পা বাড়াও।", "Make a mountain of a mole hil :\n তিলকে তাল করা।", "Success leads to success :\n জলেই জল বাঁধে।", "Beggar may sing before a pick-pocket :\nন্যাংটার নেই বাটপারের ভয়।", "Beggars must not be choosers :\nভিক্ষার চাল কাঁড়া আর আকাড়াঁ।", "Oil your own machine :\nআপন চরকায় তেল দাও।", "Many a little make a mickle :\nরাই কুড়াতে কুড়াতে বেল হয়।", "Many drops make a shower :\nবিন্দু বিন্দু জলে সিন্ধু হয়।", "Misfortune never comes alone :\nবিপদ কখনো একা আসে না।", "Necessity is the mother of invention :\n প্রয়োজনই আবিস্কারের প্রসুতি।", "Nero fiddles while Rome burns :\nকারো পৌষমাস , কারো সর্বনাশ ।", " No pains , no gain :\n কষ্ট না করলে কেষ্ট মেলে না।", "Build castle in the air :\nআকাশ কুসুম রচনা করা।", "A cat has nine lives :\nকই মাছের প্রাণ শক্ত বড়।", "Charity begins at home :\nআগে ঘর তবে তো পর।"}, new String[]{"I want to send this book to Bangladesh :\nআমি এই বইটি বাংলাদেশে পাঠাতে চাই", "My book has been stolen :\nআমার বইটি চুরি হয়ে গেছে ।", "One ticket to Bangladesh please :\n বাংলাদেশের একটি টিকেট দিন ।", "I usually drink tea at breakfast :\nআমি সকালের নাস্তায় সাধারণত চা খাই ", "His cell phone doesn't work :\nতার মুঠোফোন কাজ করছে না ।", "How do you spell it ?  :\n এটাকে তুমি কিভাবে বানান করবে ?", "You can help him :\nতুমি তাকে সাহায্য করতে পার।", "You could help him :\nতুমি তাকে সাহায্য করতে পারতে।", "Can you tell me when he leaves home? :\nতুমি কি বলতে পার কখন সে বাসা থেকে বের হয়?", "Could you tell me when he left home? :\nতুমি কি বলতে পারতে কখন সে বাসা থেকে বের হয়েছিল?", "I can reach in time :\nআমি সময়মত পৌঁছতে পারি।", "I could reach in time :\nআমি সময়মত পৌঁছতে পারতাম।"}, new String[]{"You will move and die :\nনড়েছ কি মরেছ।", "Don't be so fishy :\nএত সন্দেহ করো না।", "Have your say :\nতোমার কথা বল।", "Say something, don't be quiet :\nকিছু বল, চুপ করে থেকো না।", "I have nothing to say :\nআমার কিছু বলার নেই।", "How much does this cost? :\nএটার দাম কত?", "How much does it cost per day? :\nপ্রতিদিন কত খরচ হবে?", "How much do I owe you? :\nআমি তোমার কাছে কত টাকা ঋনী?", "How much altogether? :\nসব মিলিয়ে কত?", "How many people do you have in your family? :\nতোমার পরিবারের সদস্যসংখ্যা কত ?", "How much are these earrings? :\nএই দুল জোড়ার দাম কত?", "How much is it to go to Dhaka? :\nঢাকা যেতে কত টাকা লাগবে?", "Do you need anything else? :\nতোমার আর কিছু লাগবে?", "Do you know what this says? :\nতুমি কি জান এটা কি বোঝায়?", "Do you like your boss? :\nতুমি তোমার বসকে পছন্দ কর?", "Do you play any sports? :\nতুমি কি কোন খেলাধুলা কর?"}, new String[]{"Lunch is on me :\nলাঞ্চের টাকা আমি দেব।", "I'm sorry if I have kept you :\nতোমাকে বসিয়ে রাখার জন্য দুঃখিত।", "Good riddance! :\nযাক বাঁচা গেল।", "You have to account for your absence :\nতোমার অনুপস্থিতির জন্য জবাবদিহিকরতে হবে", "For an instance :\nউদাহরণ স্বরূপ।", "When you get real love :\nযখন তুমি সত্যিকারের ভালোবাসা পাও", "Learn to respect that :\nতাঁকে সম্মান করতে শিখ", "Never lose that in any situation! :\nকোন পরিস্থিতিতে তাঁকে হারিয়ে যেতে দিওনা", "Cause, what you got easily today :\nকারণ আজ যা তুমি সহজে পেলে", "Perhaps, you won't get that in exchange of thousand of tears tomorro :\nহয়ত কাল তা তুমি হাজার কাঁদলেওপাবে না"}, new String[]{"As you know :\nআপনারা জানেন", "As far as I'm concerned :\nআমার মতে", "According to one's version :\nবর্ণনা মোতাবেক", "Cut a good figure :\nভাল করা", "Do one's best :\nযথাসাধ্য চেষ্টা করা", "Every now and then :\nমাঝে মাঝে", "Have every right to :\nযথেষ্ট অধিকার আছে", "How come :\nকী ব্যাপার?", "How about :\nকেমন হয়?", "How so :\nতা কি করে হয়?", "How else :\nআর কি ভাবে?", "If you do care :\nযদি আপনি চান", "In my opinion :\nআমার মতে", "Little by little :\nক্রমান্বয়ে", "I tend to think :\nআমার কেন যেন মনে হয়", "Next to nothing :\nনা বললেও চলে", "On my part :\nআমার তরফ থেকে"}, new String[]{"Hang on a moment :\nএকটু অপেক্ষা কর।", "I'll be back in a moment :\nআমি এক্ষুণি আসছি।", "I'll go tomorrow :\nআমি আগামি কাল যাবো।", "You are right :\nতুমি ঠিক বলেছো।", "Too right :\nএকদম ঠিক।", "Not really :\nআসলে তা নয়।", "That's the thing :\nসেটাই।", "true enough :\nযতেষ্ট সত্য।", "That's quite right :\nসেটা ঠিক।", "That's wrong, surely :\nএটা নিশ্চয় ভুল বলেছো।"}, new String[]{"What ? :\nকি ?", "Why ?  :\n কেন ?", "Whom ? :\nকাকে ?", "How ? :\n কিভাবে ? / কেমন ?", "Where ? :\n কোথায় ?", "When ? :\nকখন ?", "Which ? :\nকোনটি ?", "Whose ?  :\n কারটি ?", "Who ? :\nকে ?", "Who ? :\n কে কে ?"}, new String[]{"I don't have any money :\n আমার কাছে একটাও টাকা নাই।", "I don't have enough money. :\nআমার যথেষ্ট টাকা নাই।", "I don't have time right now :\n ঠিক এ মুহুর্ত্তে আমার সময় নাই।", "I don't mind :\nআমি কিছু মনে করিনি।", "I don't know how to use it :\nএটা কিভাবে ব্যবহার করতে হয় আমি জানিনা", "I don't feel well :\nআমার ভালো লাগছেনা।", "I don't have a girlfriend :\nআমার কোন বান্ধবি নাই।", "I don't like him :\nআমি তাকে পছন্দ করিনা।", "Whom are you speaking of? :\nআপনি কার কথা বলেছেন?", "When you walk in my shoes, you might understand :\nযখন তুমি আমার অবস্থানে থাকবে তখন বুঝবে।", "I don’t know what his name is :\nতার নাম কি আমি জানি না।", "You are cordially invited :\nতোমাকে আন্তরিক নিমন্ত্রণ রইল।", "Your shoe is creaking :\nতোমার জুতাটা মচ-মচ করছে।"}, new String[]{"Please let me finish :\nআমাকে শেষ করতে দাও ", "Please never forget me :\nআমাকে কখনও ভুলো না", "Please be ready :\nতৈরি হও", "Be brave :\nসাহসী হও", "Be enthusiastic :\nউদ্ধমী হও", "Not at all :\nমোটেও না", "Listen to me :\nআমার কথা শুনো", "Please let me explain :\nআমাকে ব্যাখ্যা করতে দাও", "Please never mind :\nকিছু মনে করো না", "Respect your parents :\nপিতামাতাকে শ্রদ্ধা করো", "Follow me :\nআমাকে অনুসরণ করো", "You are crossing the limit :\nতুমি সীমা ছাড়িয়ে যাচ্ছো", "Enjoy your life :\nজীবন উপভোগ করো", "Don't be egoist :\nঅহংকারী হইও না", "Good day to you :\nতোমার দিন শুভ হোক", "May you be happy :\nতুমি সুখে থাকো", "Cheer you :\nভালো থেকো", "Bless you :\nতোমাকে আশির্বাদ", "You should be ashamed :\nতোমার লজ্জা থাকা উচিত", "I am satisfied :\nআমি সন্তুষ্ট", "Don't talk too much :\nবেশি কথা বলো না"}, new String[]{" I have written a love letter for you :\nআমি তোমার জন্যএকটা প্রেম পত্রলিখিয়াছি", "Will you accept my love letter :\nতুমি কি আমার প্রেম পত্র গ্রহণ করবে?", "I love you so much :\nআমি তোমায় অনেক ভালোবাসি", "But I can not say :\nকিন্তু বলতে পারি না", " I'll love you for good :\nআমি তোমাকে চিরকাল ভালোবাসবো ", "Please believe me :\nঅনুগ্রহ করে আমাকে বিশ্বাস করো", "my love is true :\nআমার ভালোবাসাসত্যি", "If my love is true :\nযদি আমার ভালোবাসা সত্যি হয়", " I'll come by you one day or other :\nআমি তোমায় কোনো না কোনো একদিন পাবো", "I think love is heaven :\n আমি মনেকরি,ভালোবাসা স্বর্", " I know you won't be able to say now :\nআমি জানি তুমি এখন বলতে পারবে না", "But you can sayafter some days :\nকিন্তু কিছু দিন পরবলতে পারো", " I'll wait for you :\nআমি তোমার জন্যঅপেক্ষা করবো"}, new String[]{"So what? :\n তাতে কি?", "Who cares! :\n কার কি যায় আসে!", "I don’t care! :\n আমি পরোয়া করি না", "I suppose so. :\n আমারও তাই মনে হচ্ছে।", "How about :\n কেমন হয়?", "You got it? :\n তুমি বুঝতে পেরেছো?", "How so :\n তা কি করে হয়?", "How else :\n আর কিভাবে?", "In my opinion :\nআমার মতে", "I don’t mind. :\n আমি কিছু মনে করি না", "Who knows! :\n কে জানে!", "Absolutely not :\n একেবারে না।", "Get lost :\n বিদায় হোন।", "No way :\n কোন ভাবেই না।", "I’d rather not :\n আমি বরং চাই না।", "I don’t want to :\n আমি চাই না।", "I shall not be able to come :\n আমি আসতে পারব না।", "Thanks for asking but I’m busy :\n জিজ্ঞাসা করার জন্য ধন্যবাদ কিন্তু আমি ব্যস্ত আছি।"}, new String[]{"I would like to go:\n আমি যেতে চাই  ", "I would like to meet the manager:\n আমি ম্যানেজারের সাথে দেখা করতে চাই    ", "I would like to meet him :\n আমি তার সাথে দেখা করতে চাই ", "I would like to thank you:\n আমি আপনাকে ধন্যবাদ জানাতে চাই   ", "I would like to explain myself:\n আমি নিজেকে ব্যাখা করতে চাই   ", "I would like to become a teacher :\n আমি একজন শিক্ষক হতে চাই   ", "I would like to see you more often :\n আমি আপনাকে প্রায়ই দেখতে চাই   ", "I would like to meet the manager:\n আমি ম্যানেজারের সাথে দেখা করতে চাই   "}, new String[]{"Do you like flower? :\n তুমি কি ফুল পছন্দ কর? ", "Do you speak English? :\n তুমি কি ইংরেজী বল? ", "Do you understand? :\n তুমি কি বুঝতে পারছ? ", "Do you exercise regularly? :\n তুমি কি নিয়মিত ব্যায়াম কর? ", "Do you think that it’ll rain today? :\n তোমার কি মনে হয় আজ বৃষ্টি হবে? ", "Do you play football every afternoon? :\n তুমি কি প্রতিদিন বিকালে ফুটবল খেলো? ", "Do you want to go with me? :\n তুমি কি আমার সাথে যেতে চাও? ", "Do you think it’s going to rain tomorrow? :\n তোমার কি মনে হয় আগামীকাল বৃষ্টি হবে? ", "Do you study a lot for the examination? :\n তুমি কি পরীক্ষার জন্য অনেক পড়াশোনা কর? "}, new String[]{"The mobile has to be repaired :\n মোবাইলটি মেরামত করতে হবে  ", "The money has to be paid :\n টাকাটি পরিশোধ করতে হবে   ", "The question has to be corrected :\n প্রশ্নটি সংশোধন করতে হবে   ", "Parents have to be respected:\n পিতামাতাকে সম্মান করতে হবে", "The Shirt has to be washed :\n শার্টটি পরিস্কার করতে হবে  ", "The poor have to be helped:\n দরিদ্রদের সাহায্য করতে হবে  ", "The table has to be cleaned:\n টেবিলটি পরিস্কার করতে হবে  "}, new String[]{"May you be happy :\n তুমি সুখে থাকো", "Stay here:\n এখানে দাঁড়াও", "I got it:\n আমি বুঝতে পেরেছি", "Don’t get nosy:\n নাক গলাবে না", "Hands off from my shoulder :\n আমার কাঁধ থেকে হাত সরাও  ", "Track the man down:\n লোকটাকে ফলো করো", "Show me how:\n কিভাবে করবো দেখাও", "It makes no sense:\n এটার কোন মানে নেই", "Nothing to worry about:\n এতোটা চিন্তার কিছু নেই"}, new String[]{"Am I pronouncing it correctly? :\n আমি কি সঠিক উচ্চারণ করছি?", "Are they the same? :\n তারা কি একই রকম?", "Are you okay? :\n তুমি ঠিক আছতো?", "Are you waiting for someone? :\n তুমি কারো জন্য অপেক্ষা করছ?", "At what time did it happen? :\n এটা কখন ঘটলো?", "Can you speak louder please? :\n অনুগ্রহ করে আরেকটু জোরে বলবেন?", "Did you get my email? :\n তুমি কি আমার ইমেইল পেয়েছিলে?", "Do you feel better? :\n ভালো বোধ করছোতো?", "Do you have another one? :\n তোমার আরো একটা আছে?", "Do you think it’s possible? :\n তুমি কি মনে কর এটা সম্ভব?", "Don’t do that:\n ওটা কারো না"}, new String[]{"I am grateful to you :\n আমি তোমার প্রতি কৃতজ্ঞ।", "Thanks a lot  :\n অনেক ধন্যবাদ।", "You've done a lot for me  :\n তুমি আমার জন্য অনেক কিছু করেছো।", "That was so kind of you  :\n এটা ছিল তোমার মহানুভবতা।", "Thanks for being helpful  :\n সহায়ক হওয়ার জন্য ধন্যবাদ।", "I will never forget what you have done :\n তুমি যা করেছো তা আমি কখনই ভুলব না।", "You are invaluable to me  :\n তুমি আমার কাছে অমূল্য।", "I appreciate you for being with me  :\n আমি তোমায় প্রশংসিত করছি আমার সাথে থাকার জন্য।"}, new String[]{"Don’t be afraid :\n ভয় পেয়ো না।", "Don’t worry about this :\n এ ব্যাপারে চিন্তা করোনা। ", "Don’t break the rules :\n নিয়ম ভেঙ্গো না। ", "Don’t tell me lies :\n আমাকে মিথ্যা বলোনা। ", "Don’t lose my number :\n আমার নাম্বারটি হারিয়ে ফেলো না। ", "Don’t argue with fools :\n বোকাদের সাথে তর্ক করোনা। ", "Don’t forget your manners :\n তোমার আচরণের কথা ভুলো না। ", "Don’t access talk to strangers :\n অপরিচিত লোকের সাথে অতিরিক্ত কথা বলোনা। ", "Don’t make me laugh :\n আমাকে হাসিও না। ", "Don’t break my heart :\n আমার হৃদয় ভেঙ্গো না। ", "Don’t waste your time :\n তোমার সময় নষ্ট করোনা। ", "Don’t give up :\n (চেষ্টা) ছেড়ে দিওনা।"}, new String[]{"I have to leave:\n আমাকে যেতে হবে", "I have to sleep:\n আমাকে ঘুমাতে হবে", "I have to use the mobile:\n আমাকে মোবাইলটা ব্যবহার করতে হবে", "I have to go to the bathroom:\n আমাকে বাথরুমে যেতে হবে", "I have to clean my bag:\n আমাকে আমার ব্যাগটা পরিষ্কার করতে হবে", "I am working on my laptop:\n আমি আমার ল্যাপটপে কাজ করছি", "I'm working on my website:\n আমি আমার ওয়েবসাইটে কাজ করছি", "I'm working on a project:\n আমি একটি প্রজেক্টে কাজ করছি", "I'm working on a research:\n আমি একটি গবেষনার উপর কাজ করছি", "I'm working on educating myself:\n আমি নিজেকে শিক্ষিত করার চেষ্টা করছি"}, new String[]{"Do you feel better? :\n ভালো বোধ করছোতো?", "Have you done this before? :\n তুমি কি এটা আগে করেছ?", "He’ll be back in 10 minutes :\n সে ১০ মিনিটের মধ্যে ফিরে আসবে", "He’s faster than me :\n সে আমার চেয়ে দ্র্রুত", "You are smarter than he :\n তুমি তার চেয়ে বুদ্ধিমান", "He’s very annoying :\n সে খুবই বিরক্তিকর", "I got sick while at the party/invitation:\n আমি দাওয়াত খেতে গিয়ে অসুস্থ হয়ে পরেছিলাম।", "If you have the patience, you will be succeed:\n যদি আপনার ধৈর্য্য থাকে তবে সফল হবেন  "}, new String[]{"All the best :\n সর্বাঙ্গীন শুভ কামনা।", "All over :\n সর্বত্র।", "Again and again :\n বারবার।", "A bed of roses :\n সুখস্বাচ্ছন্দ্যপূর্ণ জীবন।", "A black sheep :\n কুলাঙ্গার।", "A rainy day :\n দুর্দিন।", "After all :\n সবকিছু সত্ত্বেও।", "A piece of cake :\n খুবই সহজ।", "Bid fair :\n ভালো কিছু আশা করা।", "All at once :\n হঠাৎ।", "By and large :\n প্রধানত।", "A tall order :\n বিশাল ফিরিস্তি।", "Acid test :\n অগ্নিপরীক্ষা।", "A white lie :\n ইচ্ছার বিরুদ্ধে।", "Above all :\n সর্বোপরি।", "For good :\n চিরকালের জন্য।", "Far and wide :\n সর্বত্র।", "By and by :\n শীঘ্র।", "At last :\n অবশেষে।", "In time :\n ঠিক সময়ে।"}, new String[]{"We are all in complete shock :\n আমরা সবাই শোকাহত", "I was astonished :\n আমি বিস্মিত হয়েছিলাম।", "I was shocked to hear the news :\n আমি খুব কষ্ট পেয়েছিলাম খবরটা শুনে।", "Who could have predicted it? :\n কেউ কি এটা আগে থেকে চিন্তা করতে পেরেছিল।", "I just can’t get over :\n আমি কিছুতেই ভুলতে পারছি না।", "I was just stunned by her clothes :\n আমি তার পোশাক দেখে হতভম্ব হয়ে গেলাম।", "I just can't believe the terrible news :\n আমি এ ভয়ঙ্কর সংবাদটি বিশ্বাস করতে পারছি না।", "It happened out of the blue :\n এটা সম্পূর্ণ অপ্রত্যাশিতভাবেই ঘটেছিল।", "I was completely taken aback by his behavio :\n তার ব্যবহারে আমি পুরোপুরি বিস্মিত হয়েছিলাম।", "The news came as a complete shock :\n সংবাদটি যেন একটি বড় আঘাত হয়ে এসেছিল।", "That’s why you need to do the job:\n  এ কারণেই তোমার চাকরিটি করা প্রয়োজন। ", "That’s why he has gone to market  :\n এ কারণেই সে বাজারে গিয়েছে। ", "That’s why people admire you:\n  এ কারণেই লোকজন আপনাকে সম্মান করে। ", "That’s why I always try to help others  :\n এ কারণেই আমি সর্বদা অন্যকে সাহায্য করার চেষ্টা করি।", "That’s why you fail to understand:\n  এ কারণেই তুমি বুঝতে ব্যর্থ হও।", "That’s why we should inform him in time  :\n এ কারণেই তাকে আমাদের সময় মত জানানো উচিৎ।", "That’s why she smiles after seeing you:\n  এ কারণেই তোমাকে দেখার পর সে হাসে।", "That’s why you need to secure your home :\n এ কারণেই তোমার বাড়ির নিরাপত্তা বিধান করা দরকার।", "That’s why you’ve got the promotion :\n এ কারণেই তুমি পদোন্নতি পেয়েছো।"}, new String[]{"What day of the week is it? :\n আজ সপ্তাহের কোন দিন?  ", "Please never forget me :\n আমাকে কখনও ভুলো না।  ", "If you allow me to say :\n আপনি যদি অনুমতি দেন তবে বলি।  ", "I have a lot of things to do :\n আমার অনেক কিছু করার আছে।  ", "You are going beyond limits :\n তুমি সীমা ছাড়িয়ে যাচ্ছো।  ", "I have a headache :\n আমার মাথা ব্যাথা করছে।  ", "I promise I will  :\n আমি কথা দিচ্ছি আমি করব  ", "You can trust me  :\n আমার উপর ভরসা করতে পারেন।  ", "Do not put me in shame? :\n আমাকে লজ্জা দিও না? "}, new String[]{"Can I sit beside you? :\n আমি কি আপনার পাশে বসতে পারি?  ", "They go to school by bus :\n তারা বাসে চড়ে স্কুলে যায়।  ", "By nature, he is shy  :\n স্বভাবত সে লাজুক।", "He was standing beside me :\n সে আমার পাশে দাড়িয়েছিল।", "Please send message by email :\n দয়া করে ইমেইলে মেসেজটি পাঠান।", "The school is by the new market  :\n স্কুলটি নিউ মার্কেটের পাশে অবস্থিত।", "His house is by the mosque :\n তার বাড়ি মসজিদের পাশে।", "The Hospital is by the Bank:\n  হাসপাতালটি ব্যাংকের পাশে অবস্থিত।", "He sent a flower by his friend:\n সে তার বন্ধুর মাধ্যমে একটি ফুল পাঠিয়েছিল।", "He was accompanied by his father :\n সে তার পিতার সঙ্গী হয়েছিল।", "You should abide by the rules:\n তোমার নিয়মাবলি মেনে চলা উচিৎ।"}, new String[]{"So what? :\n তাতে কি?", "Who cares! :\n কার কি যায় আসে!", "I don’t care! :\n আমি পরোয়া করি না", "I suppose so :\n আমারও তাই মনে হচ্ছে।", "How about :\n কেমন হয়?", "You got it? :\n তুমি বুঝতে পেরেছো?", "How so:\n তা কি করে হয়?", "How else :\n আর কিভাবে?", "In my opinion :\nআমার মতে", "I don’t mind :\n আমি কিছু মনে করি না", "Who knows! :\n কে জানে!"}, new String[]{"Excuse Me :\n শুনুন।", "Can you hear me? :\n আমার কথা শুনছেন?", "Listen to me :\n আমার কথা শুনুন।", "Hey, got it? :\n এই, বুঝতে পেরেছো?", "Oh, come on! :\n আহ, একটু বুঝতে চেষ্টা করোতো।", "May I have your attention please :\n আপনি যদি একটু এদিকে নজর দেন।", "Is it clear to you? :\n এটা কি তোমার কাছে পরিষ্কার?", "Are you with me? :\n আমার কথা শুনছেন তো?", "I agree on this matter :\n আমি এই বিষয়ে একমত  ", "Attach this file to the email:\n ইমেইলে এই ফাইলটি সংযুক্ত করুন  ", "Everyone should abide by the rules :\n প্রত্যেকের উচিৎ নিয়ম মেনে চলা  ", "Take care of your health :\n আপনার স্বাস্থ্যের প্রতি যত্ন নিন", "I do not believe in his honesty :\n আমি তার সততাকে বিশ্বাস করি না  ", " Man should aware of the danger of environment pollution :\n মানুষের উচিৎ পরিবেশ দূষণের বিপদ সম্পর্কে সচেতন হওয়া।", " Success depends on hard work :\n সাফল্য কঠোর পরিশ্রমের উপর নির্ভর করে  ", "According to his order I went there :\n তার আদেশ অনুযায়ী আমি সেখানে গিয়েছিলাম  "}, new String[]{"How often do you exercise?  :\n তুমি কতদিন পর পর ব্যায়াম কর।  ", "How often do you go to doctor for checkup? :\n  তুমি চেকআপের জন্য কতদিন পর পর ডাক্তারের কাছে যাও?  ", "How often do you visit to your parents?  :\n তুমি কতদিন পর পর তোমার মাবাবার সাথে দেখা কর?   ", "How often do you change your password? :\n তুমি কতদিন পর পর তোমার পাসওয়ার্ড পরিবর্তন কর?   ", "How often do you need facial?  :\n কতদিন পর পর তোমার ফেসিয়াল করা প্রয়োজন হয়?   ", "How often do you water in flower garden? :\n কতদিন পর পর তুমি ফুল বাগানে পানি দাও?  "}, new String[]{"There’s no need to call him :\n তাকে ডাকার কোন দরকার নেই।  ", "There’s no need to bother him :\n তাকে বিরক্ত করার কোন দরকার নেই।  ", "There’s no need to be upset :\n হতাশ হওয়ার কোন দরকার নেই।  ", "There’s no need to go back :\n ফিরে যাওয়ার কোন দরকার নেই।  ", "There’s no need to stop now :\n এখন বন্ধ করার কোন দরকার নেই।  ", "There’s no need to tell lies :\n মিথ্যা বলার কোন দরকার নেই।  ", "There’s no need to be worried :\n চিন্তিত হওয়ার কোন দরকার নেই।  ", "There’s no need to talk about her :\n তার সম্পর্কে কথা বলার কোন দরকার নেই।  "}, new String[]{"This is not true :\n এটা সত্যি নয়।   ", "I do not agree :\n আমি মানি না।  ", "Don’t be angry:\n রাগ করবেন না।  ", "I refuse:\n আমি প্রত্যাখান করি।  "}, new String[]{"I know nothing in this connection:\n আমি এই বিষয়ে কিছুই জানিনা।  ", "I will not participate in this competition :\n আমি এই প্রতিযোগিতায় অংশগ্রহন করব না।  ", "I cannot help you :\n আমি আপনাকে সাহায্য করতে পারব না।   ", "You should not sleep late:\n দেরি করে ঘুমানো উচিৎ না।  "}, new String[]{"Let me check:\n আমাকে দেখতে দাও  ", "Let’s go have a look:\n চল গিয়ে দেখি  ", "I have not scolded you:\n আমি তোমাকে বকিনি    ", "Has not Rafiq got salary this month? :\n রফিক কি এ মাসে বেতন পায়নি?   ", "Have you told him the matter? :\n তুমিকি তাকে ব্যাপারটা বলেছ?    ", "Have you broken this pen? :\n তুমিকি এই কলমটা ভেঙ্গেছ?   ", "Have you heard this news? :\n তোমরা কি এই খবরটা শুনেছ?   ", "The train has not yet started:\n ট্রেনটি এখনও ছাড়েনি   ", "Has Raju replied to your letter? :\n রাজু কি তোমার চিঠির উত্তর দিয়েছে?    ", "How absurd! :\n কি বাজে/ কি বিরক্তিকর!  ", "It seems to be right, :\n এটা ঠিক মনে হয়    ", "We are all in complete shock :\n আমরা সবাই শোকাহত  ", "I was astonished :\n আমি বিস্মিত হয়েছিলাম।  ", "The news came as a complete shock:\n সংবাদটি যেন একটি বড় আঘাত হয়ে এসেছিল।  ", "I was shocked to hear the news :\n আমি খুব কষ্ট পেয়েছিলাম খবরটা শুনে।  ", "Who could have predicted it? :\n কেউ কি এটা আগে থেকে চিন্তা করতে পেরেছিল।  ", "I just can’t get over :\n আমি কিছুতেই ভুলতে পারছি না।  ", "I was just stunned by her clothes :\n আমি তার পোশাক দেখে হতভম্ব হয়ে গেলাম।  ", "I just can't believe the terrible news:\n আমি এ ভয়ঙ্কর সংবাদটি বিশ্বাস করতে পারছি না।  ", "I’m coming to pick you up :\n আমি তোমাকে নিতে আসছি  ", "I’m getting ready to go out :\n আমি বাইরে যাবার জন্য তৈরী হচ্ছি  ", "I’m going to go have dinner :\n আমি রাতের খাবার খেতে যাচ্ছি  "}, new String[]{"I’m good :\n আমি ভালো আছি  ", "I’m just kidding :\n আমি ঠাট্টা করছি  ", "I’m just looking :\n আমি শুধু দেখছি  ", "I’m lost :\n আমি হারিয়ে গেছি  ", "I’m not ready yet :\n আমি এখনো প্রস্তুত নই  ", "In 30 minutes :\n ৩০ মিনিটের ভেতর  ", "Expiration date:\n মেয়াদ উত্তীর্ণের তারিখ  ", "Whats wrong?  :\n সমস্যা কি?  ", "I'm little bit unhappy  :\n আমি কিছুটা অসুখী।  ", "Are you alright? :\n তুমি কি ঠিক আছো?  ", "You seem depressed Whats the matter? :\n তোমাকে হতাশ লাগছে। ব্যাপারটা কি?  ", "Are you OK? :\n তুমি কি ঠিক আছো?  ", "Why do you depressed? :\n  তুমি হতাশ কেন?  ", "I feel good :\n আমার ভালো লাগছে  ", "I give up:\n আমি ছেড়ে দিয়েছি  ", "I haven’t been there :\n আমি সেখানে ছিলামনা  ", "I still haven’t decided about this matter :\n আমি এ বিষয়ে এখনো সিদ্ধান্ত নিতে পারিনি  ", "I wish I had one :\n ইচ্ছা করছে আমারও যদি একটা থাকত  ", "I’ll have a cup of coffee please :\n আমাকে এক কাপ কফি দেবেন  ", "I’ll take it:\n আমি এটা নেবো  ", "I’ll take that one also:\n আমি ওটাও নেবো  ", "I’ll tell him you called :\n আমি তাকে বলবো তুমি ফোন করেছিলে  ", "I’m bored :\n আমি হাপিয়ে উঠেছি  ", "I’m coming to pick you up:\n আমি তোমাকে নিতে আসছি  "}, new String[]{"I would like to go:\n আমি যেতে চাই    ", "I would like to meet him:\n আমি তার সাথে দেখা করতে চাই    ", "I would like to thank you :\n আমি আপনাকে ধন্যবাদ জানাতে চাই    ", "I would like to explain myself :\n আমি নিজেকে ব্যাখা করতে চাই    ", "I would like to become a teacher :\n আমি একজন শিক্ষক হতে চাই    ", "I would like to see you more often :\n আমি আপনাকে প্রায়ই দেখতে চাই    ", "I would like to meet the manager :\n আমি ম্যানেজারের সাথে দেখা করতে চাই    ", "I would like to practice :\n আমি অনুশীলন করতে চাই    ", "I would like to compete in a cooking contest:\n আমি একটি রান্নার প্রতিযোগিতায় প্রতিদ্বন্দ্বিতা করতে চাই    "}, new String[]{"Whats happened:\n কি হয়েছে  ", "Thats right:\n ঠিক বলেছেন  ", "definitely:\n অবশ্যই  ", "Oh shit:\n ধ্যাত্তেরি  ", "Keep quiet:\n চুপ কর  ", "Its enough:\n যথেষ্ট হয়েছ  ", "So be it:\n তবে তাই হোক  ", "Excuse me :\n এই যে শুনুন   ", "That’s fantastic :\n এটা সত্যি চমৎকার   ", "really pleased :\n সত্যি আনন্দিত   ", "Delighted :\n নন্দিত  ", "What an idea! :\n কি বুদ্ধি!", "What a shame! :\n কি লজ্জার কথা!   ", "Well done:\n সাবাশ  ", "Marvelous :\n বা বেশ  ", "Let me see:\n আমাকে দেখতে দাও  ", "Yes go on:\n হ্যা, বলতে থাক  ", "Oh sure:\n ও নিশ্চয়ই  ", "Wow:\n বাহ, দারুন তো  ", "I think so:\n আমি তাই মনে করি  ", "Oh come on:\n আহ! একটু বুঝতে চেষ্টা করো  ", "Not a bit:\n একটুও না  ", "Suppose:\n মনে করো  ", "Anybody here :\n এখানে কেও আছেন  ", "Understand:\n বুঝেছি  ", "Whats happened :\n কি হয়েছে  ", "Thats right:\n ঠিক বলেছেন  ", "definitely:\n অবশ্যই  ", "Oh shit:\n ধ্যাত্তেরি  ", "Keep quiet:\n চুপ কর  ", "Its enough:\n যথেষ্ট হয়েছ  ", "How Nice! :\n কি সুন্দর!   ", "What nonsense!:\nকি বাজে বকো!  ", "Yes, it is:\n ঠিকই তো   ", "It has been so long :\n কতদিন পর দেখা   ", "Wait a little bit :\n খানিক অপেক্ষা কর   ", "So it is:\n তাই তো  ", "Let’s sit somewhere:\n চল কোথাও বসি  ", "What about you? :\n তোমার কি খবর?  ", "so so:\n মোটামোটি  "}, new String[]{"I'm sorry to be so late:\n আমি এত দেরি করার জন্য দুঃখিত  ", "I'm sorry to hear about your sick mother :\n আমি আপনার অসুস্থ মা সম্পর্কে শুনে দুঃখিত  ", "I'm sorry to waste your time :\n আপনার সময় নষ্ট করার জন্য আমি দুঃখিত  ", "I'm sorry to make mistake :\n ভুল করার জন্য আমি দুঃখিত  ", "I'm sorry to frighten you :\n আমি আপনাকে ভয় দেখানোর জন্য দুঃখিত  ", "Am I pronouncing it correctly? :\n আমি কি সঠিক উচ্চারণ করছি?  ", "Are they the same? :\n তারা কি একই রকম?  ", "Are you okay? :\n তুমি ঠিক আছতো?  ", "Are you waiting for someone? :\n তুমি কারো জন্য অপেক্ষা করছ?  ", "At what time did it happen? :\n এটা কখন ঘটলো?  ", "Can you speak louder please? :\n অনুগ্রহ করে আরেকটু জোরে বলবেন?  ", "Did you get my email? :\n তুমি কি আমার ইমেইল পেয়েছিলে?  ", "Do you feel better? :\n ভালো বোধ করছোতো?  ", "Do you have another one? :\n তোমার আরো একটা আছে?  ", "Do you think it’s possible? :\n তুমি কি মনে কর এটা সম্ভব?  ", "Don’t do that :\n ওটা কারো না  ", "From time to time:\n কখনো কখনো  ", "From here to there :\n এখান থেকে ওখানে  ", "Have you arrived? :\n তুমি পৌছিয়েছ?  ", "He thinks we don’t want to go:\n সে ভাবছে আমরা যেতে চাইনা    ", "That’s why you need to do the job  :\n এ কারণেই তোমার চাকরিটি করা প্রয়োজন।   ", "That’s why he has gone to market  :\n এ কারণেই সে বাজারে গিয়েছে।   ", "That’s why people admire you:\n  এ কারণেই লোকজন আপনাকে সম্মান করে।   ", "That’s why I always try to help others  :\n এ কারণেই আমি সর্বদা অন্যকে সাহায্য করার চেষ্টা করি।  ", "That’s why you fail to understand:\n  এ কারণেই তুমি বুঝতে ব্যর্থ হও।  ", "That’s why she smiles after seeing you:\n  এ কারণেই তোমাকে দেখার পর সে হাসে।  ", "That’s why you need to secure your home :\n এ কারণেই তোমার বাড়ির নিরাপত্তা বিধান করা দরকার।  ", "That’s why you’ve got the promotion :\n এ কারণেই তুমি পদোন্নতি পেয়েছো।  ", "That’s why we need to be skilled:\n  এ কারণেই তোমার দক্ষ হওয়া প্রয়োজন।  "}, new String[]{" I'm yours :\n আমি তোমার।  ", " You are my heart  :\n তুমি আমার হৃদয়।  ", " You are my everything :\n তুমি আমার সবকিছু।  ", " I adore you :\n আমি তোমাকে গভীরভাবে ভালোবাসি।  ", " You are the one for me :\n তুমিই আমার একজন।  ", " I'm addicted to you:\n  আমি তোমার প্রতি আসক্ত।  ", " I'm all about you :\n আমি তোমাকেই চাই।  ", " I feel you in every breath  :\n আমি তোমায় প্রতি নিঃশ্বাসে অনুভব করি।  ", " You are my dream  :\n তুমি আমার স্বপ্ন।  "}, new String[]{" I've got feelings for you  :\n তোমার জন্য আমার অনুভূতি রয়েছে।  ", "I'm getting better :\n আমি উন্নতি করছি  ", "I'm getting ready for bed :\n আমি ঘুমানোর জন্য প্রস্তুত হচ্ছি  ", "I'm getting a tooth ache :\n আমি একটি দাঁতে ব্যাথা পেয়েছি  ", "I'm getting a ill:\n আমি অসুস্থ হয়ে যাচ্ছি  ", "I'm getting married :\n আমি বিবাহ করতে যাচ্ছি  ", "He got the job because of being skilled in English :\n ইংরেজিতে দক্ষ হওয়ার কারণে সে চাকুরি পেয়েছে।   ", " He didn’t go to office because of being sick :\n অসুস্থ হওয়ার কারণে সে অফিসে যেতে পারেনি।   ", "Nobody likes him because of being talkative  :\n বাচাল হওয়ার কারণে তাকে কেউ পছন্দ করে না।   ", "They won the game because of being encouraged :\n উৎসাহিত হওয়ার কারণে তারা খেলায় জিতেছিল।   "}, new String[]{"I wanna talk to him :\n আমি তার সাথে কথা বলতে চাই।  ", "What you wanna do now? :\n তুমি এখন কি করতে চাও?  ", "I'm gonna have some coffee :\n আমি একটু কফি খেতে যাচ্ছি।  ", "What we gonna do now? :\n আমরা এখন কি করতে যাচ্ছি?  ", "I gotta save some money:\n আমার কিছু টাকা জমাতে হবে।  ", "I gotta obey the laws :\n আমাকে আইন মানতে হবে।  "}, new String[]{"Don’t be afraid :\n ভয় পেয়ো না।  ", "Don’t worry about this :\n এ ব্যাপারে চিন্তা করোনা।   ", "Don’t break the rules :\n নিয়ম ভেঙ্গো না।  ", "Don’t tell me lies :\n আমাকে মিথ্যা বলোনা।   ", "Don’t lose my number :\n আমার নাম্বারটি হারিয়ে ফেলো না।   ", "Don’t argue with fools:\n বোকাদের সাথে তর্ক করোনা।   ", "Don’t forget your manners :\n তোমার আচরণের কথা ভুলো না।   ", "Don’t access talk to strangers :\n অপরিচিত লোকের সাথে অতিরিক্ত কথা বলোনা।   ", "Don’t make me laugh :\n আমাকে হাসিও না।   ", "Don’t break my heart :\n আমার হৃদয় ভেঙ্গো না।   ", "Don’t waste your time :\n তোমার সময় নষ্ট করোনা।   ", "Don’t give up :\n (চেষ্টা) ছেড়ে দিওনা।  ", "We are all in complete shock :\n আমরা সবাই শোকাহত  ", "I was astonished :\n আমি বিস্মিত হয়েছিলাম।  ", "The news came as a complete shock:\n সংবাদটি যেন একটি বড় আঘাত হয়ে এসেছিল।  ", "I was shocked to hear the news:\n আমি খুব কষ্ট পেয়েছিলাম খবরটা শুনে।  ", "Who could have predicted it? :\n কেউ কি এটা আগে থেকে চিন্তা করতে পেরেছিল।  ", "I just can’t get over :\n আমি কিছুতেই ভুলতে পারছি না।  ", "I was just stunned by her clothes:\n আমি তার পোশাক দেখে হতভম্ব হয়ে গেলাম।  ", "I just can't believe the terrible news :\n আমি এ ভয়ঙ্কর সংবাদটি বিশ্বাস করতে পারছি না।  "}, new String[]{"Have a nice day :\n আপনার দিনটি শুভ হোক  ", "I run every day :\n আমি প্রতিদিন দৌড়াই  ", "It's a nice day:\n এটা একটা চমৎকার দিন  ", "How was your day? :\n দিনটা কেমন গেছে তোমার?  ", "It's a windy day :\n এটা একটি ঝড়ো দিন   ", "He took a day off:\n তিনি একদিন ছুটি নিয়েছিলেন   ", "I was out all day :\n আমি সারাদিন বাইরে ছিলাম  ", "It's a cloudy day :\n এটা একটা মেঘলা দিন   ", "I stayed home all day:\n আমি সারাদিন বাড়িতে ছিলাম   ", "It was a terrible day:\n এটা একটা ভয়ানক দিন ছিল   "}, new String[]{"Weather forecast :\n আবহাওয়ার পূর্বাভাস।  ", "Hurricane:\n  প্রবল সামুদ্রিক ঝড়।  ", "Sandstorm  :\n মরুভূমির বালুঝড়।  ", "Whirlwind:\n  ঘূর্ণিঝড়।   ", "Tornado:\n  প্রচন্ড ঘূর্ণিবায়ূ।  ", "Earthquake  :\n ভূমিকম্প।  ", "Rainy day  :\n বৃষ্টির দিন।  ", "Overcast :\n মেঘাচ্ছন্ন।  ", "Sunny:\n  রৌদ্রজ্জল।  ", "Sunshine:\n  রৌদ্র।  ", "Moonlight  :\n চন্দ্রালোকিত।  ", "Sunrise :\n সূর্যোদয়।  ", "Heavy snow  :\n ভারি তুষারপাত।  ", "Say :\n ধর/ধরুন।  ", "Wow! :\n  বাহ দারুন তো।  ", "How strange :\n আশ্চর্য।  ", "What a surprise :\n হঠাৎ যে।  ", "To be frank:\n  খোলাখুলিভাবে বলতে গেলে।   ", "Let it pass:\n  ছেড়ে দিন।  ", "So kind of you!  :\n আপনার দয়া।  ", "It’s only a rumor :\n নেহাতই গুজব।  ", "Speak with care :\n সাবধানে কথা বল।  ", "Do you have any business with me? :\n আমার সাথে আপনার কি কোন কাজ আছে?  ", "There is nothing to fear :\n ভয়ের কোন কারণ নেই।  ", "That’s a good effort  :\n এটা একটা ভাল প্রচেষ্টা।  ", "I’m so proud of you! :\n আমি তোমার জন্য গর্বিত।  ", "Keep going  :\n চলতে থাকো।   ", "Believe in yourself  :\n নিজের উপর বিশ্বাস রাখ।   ", "Don’t be afraid  :\n ভয় পেয়ো না।  ", "Never give up:\n  হাল ছেড়ো না।  ", "Don’t get nervous  :\n ঘাবড়াবে না।  ", "It looks like a Kite :\n এটা ঘুড়ির মত দেখায়  ", "It looks like a Tree:\n এটি একটি বৃক্ষের মত দেখায়  ", "It looks like a pen:\n এটি দেখতে কলমের মত  ", "It looks like a bird:\n এটি দেখতে পাখির মত  ", "It looks like an angel :\n এটি দেখতে পরীর মত  ", "It looks like she is lost:\n দেখে মনে হচ্ছে সে হারিয়ে গেছে  ", "It looks like they are swimming:\n দেখে মনে হচ্ছে তারা সাঁতার কাটছে  ", "Let me check:\n আমাকে দেখতে দাও  ", "Let’s go have a look:\n চল গিয়ে দেখি  ", "I have not scolded you :\n আমি তোমাকে বকিনি  ", "Has not Rafiq got salary this month? :\n রফিক কি এ মাসে বেতন পায়নি?   ", " Have you told him the matter? :\n তুমিকি তাকে ব্যাপারটা বলেছ?  ", " Have you broken this pen? :\n তুমিকি এই কলমটা ভেঙ্গেছ?  ", "Have you heard this news? :\n তোমরা কি এই খবরটা শুনেছ?  ", " The train has not yet started:\n ট্রেনটি এখনও ছাড়েনি  ", " Has Raju replied to your letter? :\n রাজু কি তোমার চিঠির উত্তর দিয়েছে?  ", " How absurd! :\n কি বাজে/ কি বিরক্তিকর!  ", " It seems to be right:\n এটা ঠিক মনে হয়  ", "The bullet missed him by one inch :\n গুলিটি এক ইঞ্চির জন্য তার গায়ে লাগেনি।  ", "I missed the bus by 10 minutes :\n আমি ১০ মিনিটের জন্য বাসটি মিস করলাম।  ", "I missed the sunset by 5 minutes:\n আমি ৫ মিনিটের জন্য সূর্যাস্ত মিস করলাম।  ", "I missed Rina by half hour:\n আমি রিনাকে আধাঁ ঘন্টার জন্য পেলাম না।   ", "General_Agreeing‬ :\n সাধারণ সম্মতি প্রকাশ  ", "I agree with you :\n আমি তোমার সাথে একমত।  ", "I think you are right :\n আমার মনে হয় তুমি সঠিক।  ", "That’s right :\n সেটা ঠিক।  ", "I fully agree with you :\n আমি তোমার সাথে সম্পূর্ণ একমত।  ", "You are absolutely right :\n তুমি সম্পূর্ণ সঠিক।  ", "That’s so true :\n সেটা পুরাপুরি সত্য।  ", "I totally disagree :\n আমি সম্পূর্ণ অমত।  ", "I don’t agree with you :\n আমি তোমার সাথে একমত নই।  ", "I’ll never agree :\n আমি কখনই রাজি হব না।  ", "I am sorry to say this :\n আমার বলতে খারাপ লাগছে।"}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        recyclerDetails = findViewById(R.id.recyclerDetailsId);
        recyclerDetails.setLayoutManager(new LinearLayoutManager(this));


        Bundle bundle = getIntent().getExtras();

        String getPosition = bundle.getString("position");



        if (getPosition.equals("0"))
        {
            ArrayList<DetailsInfo> titleList = shadaron_khotha();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);

        }


      else if (getPosition.equals("1"))
        {
            ArrayList<DetailsInfo> titleList = english1();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("2"))
        {
            ArrayList<DetailsInfo> titleList = english2();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("3"))
        {
            ArrayList<DetailsInfo> titleList = english3();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("4"))
        {
            ArrayList<DetailsInfo> titleList = english4();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("5"))
        {
            ArrayList<DetailsInfo> titleList = english15();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("6"))
        {
            ArrayList<DetailsInfo> titleList = english6();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("6"))
        {
            ArrayList<DetailsInfo> titleList = english6();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("7"))
        {
            ArrayList<DetailsInfo> titleList = english7();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("8"))
        {
            ArrayList<DetailsInfo> titleList = english8();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("9"))
        {
            ArrayList<DetailsInfo> titleList = english9();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("10"))
        {
            ArrayList<DetailsInfo> titleList = english10();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("11"))
        {
            ArrayList<DetailsInfo> titleList = english11();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("12"))
        {
            ArrayList<DetailsInfo> titleList = english12();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("13"))
        {
            ArrayList<DetailsInfo> titleList = english3();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("14"))
        {
            ArrayList<DetailsInfo> titleList = english14();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("15"))
        {
            ArrayList<DetailsInfo> titleList = english15();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("16"))
        {
            ArrayList<DetailsInfo> titleList = english16();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("17"))
        {
            ArrayList<DetailsInfo> titleList = english17();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("18"))
        {
            ArrayList<DetailsInfo> titleList = english18();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("19"))
        {
            ArrayList<DetailsInfo> titleList = english19();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("20"))
        {
            ArrayList<DetailsInfo> titleList = english20();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("21"))
        {
            ArrayList<DetailsInfo> titleList = english21();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("22"))
        {
            ArrayList<DetailsInfo> titleList = english22();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("23"))
        {
            ArrayList<DetailsInfo> titleList = english23();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("24"))
        {
            ArrayList<DetailsInfo> titleList = english24();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("25"))
        {
            ArrayList<DetailsInfo> titleList = english25();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("26"))
        {
            ArrayList<DetailsInfo> titleList = english26();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("27"))
        {
            ArrayList<DetailsInfo> titleList = english27();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("28"))
        {
            ArrayList<DetailsInfo> titleList = english28();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("29"))
        {
            ArrayList<DetailsInfo> titleList = english29();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("30"))
        {
            ArrayList<DetailsInfo> titleList = english30();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("31"))
        {
            ArrayList<DetailsInfo> titleList = english31();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("32"))
        {
            ArrayList<DetailsInfo> titleList = english32();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("33"))
        {
            ArrayList<DetailsInfo> titleList = english33();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("34"))
        {
            ArrayList<DetailsInfo> titleList = english34();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("35"))
        {
            ArrayList<DetailsInfo> titleList = english35();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("36"))
        {
            ArrayList<DetailsInfo> titleList = english36();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("27"))
        {
            ArrayList<DetailsInfo> titleList = english27();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("38"))
        {
            ArrayList<DetailsInfo> titleList = english38();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("39"))
        {
            ArrayList<DetailsInfo> titleList = english39();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("40"))
        {
            ArrayList<DetailsInfo> titleList = english40();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("41"))
        {
            ArrayList<DetailsInfo> titleList = english41();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("42"))
        {
            ArrayList<DetailsInfo> titleList = english42();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("43"))
        {
            ArrayList<DetailsInfo> titleList = english43();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("44"))
        {
            ArrayList<DetailsInfo> titleList = english44();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }

      else if (getPosition.equals("45"))
        {
            ArrayList<DetailsInfo> titleList = english45();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }



      else if (getPosition.equals("46"))
        {
            ArrayList<DetailsInfo> titleList = english46();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("47"))
        {
            ArrayList<DetailsInfo> titleList = english47();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("48"))
        {
            ArrayList<DetailsInfo> titleList = english48();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("49"))
        {
            ArrayList<DetailsInfo> titleList = english49();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("50"))
        {
            ArrayList<DetailsInfo> titleList = english50();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("51"))
        {
            ArrayList<DetailsInfo> titleList = english52();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("52"))
        {
            ArrayList<DetailsInfo> titleList = english52();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("53"))
        {
            ArrayList<DetailsInfo> titleList = english53();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("54"))
        {
            ArrayList<DetailsInfo> titleList = english54();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }


      else if (getPosition.equals("55"))
        {
            ArrayList<DetailsInfo> titleList = english55();
            DetailsAdapter adapter = new DetailsAdapter(this,titleList);
            recyclerDetails.setAdapter(adapter);
        }





}

    private ArrayList<DetailsInfo> shadaron_khotha()

    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Good morning Mother","শুভ সকাল সকাল মা।"));
        list.add(new DetailsInfo(2,"Good afternoon grandmother","শুভ বিকাল দিদিমা।"));
        list.add(new DetailsInfo(3,"Good night","শুভ রাত্রি"));
        list.add(new DetailsInfo(4,"Good by","বিদায়"));
        list.add(new DetailsInfo(5,"See you again","আবার দেখা হবে।"));
        list.add(new DetailsInfo(6,"Please","দয়া করে।"));
        list.add(new DetailsInfo(7,"Welcome","স্বাগতম"));
        list.add(new DetailsInfo(8,"Sorry ","দুঃখিত"));
        list.add(new DetailsInfo(9,"Thanks","ধন্যবাদ"));
        list.add(new DetailsInfo(10,"With great pleasure","অত্যন্ত আনন্দের সাথে।"));
        list.add(new DetailsInfo(11,"Excuse me","আমাকে মাফ করবেন।"));
        list.add(new DetailsInfo(12,"No mention ","কোনো ব্যপার না।"));
        list.add(new DetailsInfo(13,"Some body come here","কেউ এখানে এসো "));
        list.add(new DetailsInfo(14,"They are not good friends","ওরা ভালো বন্ধু নয় "));
        list.add(new DetailsInfo(15,"I don’t know him ","আমি তাকে চিনি না "));
        list.add(new DetailsInfo(16,"He is not eating","সে খাচ্ছে না "));
        list.add(new DetailsInfo(17,"Rasel was not there ","রাসেল সেখানে ছিল না "));
        list.add(new DetailsInfo(18,"I shall wait until you come back ","তুমি যতক্ষণ না ফের, ততক্ষণ আমি অপেক্ষা করব।"));
        list.add(new DetailsInfo(20,"What’s the time","কয়টা বাজে ?"));
        list.add(new DetailsInfo(21,"You mind your business","আপনি নিজের কাজ করুন "));
        list.add(new DetailsInfo(22,"What is the time by your watch ?","আপনার ঘড়িতে এখন কয়টা বাজে ?"));
        list.add(new DetailsInfo(23,"Are you coming or not ? ","আপনি আসবেন কি আসবেন না ?"));
        list.add(new DetailsInfo(24,"Who will help him ? ","তাকে কে সাহায্য করবে ?"));
        list.add(new DetailsInfo(25,"I’ll go tomorrow ","আমি আগামি কাল যাবো ।"));
        list.add(new DetailsInfo(26,"We aren’t sure ","আমরা নিশ্চিত নই "));
        list.add(new DetailsInfo(27,"I shall finish my work by Sunday","রবিবারের মধ্যে আমি আমার কাজ শেষ করবো"));
        list.add(new DetailsInfo(28,"I don’t take tea","আমি চা পান করি না "));
        list.add(new DetailsInfo(29,"Just coming.","আমি এই এসেছি"));
        list.add(new DetailsInfo(30,"Very well.","বেশ/খুব ভালো"));
        list.add(new DetailsInfo(31,"Its fine./ Very good","ঠিক আছে"));
        list.add(new DetailsInfo(32,"As you like./As you please","আপনি যা বলেন/আপনার যা ইচ্ছা"));
        list.add(new DetailsInfo(33,"Anything else? ","আর কিছু?"));

        return list;
    }


    private ArrayList<DetailsInfo> english1()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"who is coming","কে আসছে"));
        list.add(new DetailsInfo(2,"what is the menu for dinner?","রাতে কি রান্না হয়েছে   ?"));
        list.add(new DetailsInfo(3,"where we will meet ?","আমরা কোথায় দেখা করবো ?"));
        list.add(new DetailsInfo(4,"The more I love you","আমি যত বেশি ভালোবাসি তোমায় "));
        list.add(new DetailsInfo(5,"The more I want to love you","তার চেয়েও বেশি ভালোবাসতে চাই |"));
        list.add(new DetailsInfo(6,"he more close I come to you","আমি যত বেশি কাছে আসি তোমার |"));
        list.add(new DetailsInfo(7,"The more close I want to come","তার চেয়েও বেশি কাছে আসতে চাই |"));
        list.add(new DetailsInfo(8,"Give me a hug with love","ভালোবেসে আমাকে নাও জড়িয়ে"));
        list.add(new DetailsInfo(9,"Make me colored with the touch of your love","তোমার প্রেমের ছোয়াতে দাও রাঙিয়ে"));
        list.add(new DetailsInfo(10,"Sunshine of the morning awakes me everyday","সকালের সোনা রোদ প্রতিদিন আমার ঘুম ভাঙ্গায়|"));
        list.add(new DetailsInfo(11,"Opening the eyes my heart wants your touch","চোখ মেলে এ হৃদয় তোমারি পরশ চায় |"));
        list.add(new DetailsInfo(12,"You cooled my mind down with the frost air","হিমেল হাওয়াতে এ মন জুড়ালে গো হায় |"));
        list.add(new DetailsInfo(13,"Even though my heart not refreshed if I donot get you close","তবু এ মন জুড়ায় না তো যদি কাছে না পাই তোমায় |"));
        return list;
    }

    private ArrayList<DetailsInfo> english2()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"What the hell are you talking?","কি যা তা বলতেছো?"));
        list.add(new DetailsInfo(2,"How beautiful you are!","তুমি কত সুন্দর!"));
        list.add(new DetailsInfo(3,"You are in my breath","নিশ্বাস আমার তুমি"));
        list.add(new DetailsInfo(4,"My heart is only for you ","হৃদয় শুধু তোমার জন্য"));
        list.add(new DetailsInfo(5,"Give to take","কিছু পেতে হলে কিছু দিতে হয়"));
        list.add(new DetailsInfo(6,"Out of sight, out of mind","চোখের আড়াল মানে মনের আড়াল"));
        list.add(new DetailsInfo(7,"Don't get mad","বোকামী করোনা !"));
        list.add(new DetailsInfo(8,"What a pleasant surprise!","কি দারুণ চমক !"));
        list.add(new DetailsInfo(9,"My Goodness","হায় আল্লাহ্ !"));
        list.add(new DetailsInfo(10,"That's all nonsense","সব বাজে কথা"));
        list.add(new DetailsInfo(11,"What a nuisance! "," কি আপদ !"));
        list.add(new DetailsInfo(12,"But who cares?","কে ধারধারে?"));
        list.add(new DetailsInfo(13,"Question does not arise","প্রশ্নই উঠে না "));
        list.add(new DetailsInfo(14,"Worthless! ","অপদার্থ কোথাকার"));
        list.add(new DetailsInfo(15,"Not at all ","মোটেও নয়"));
        list.add(new DetailsInfo(16,"Go to the devil ","গোল্লায় যাক"));
        return list;
    }

    private ArrayList<DetailsInfo> english3()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Don't be impractical","ধৈর্য্য হারা হয়ো না"));
        list.add(new DetailsInfo(2,"Don't break the rules ","নিয়ম ভঙ্গ কর না"));
        list.add(new DetailsInfo(3,"Don't get excited"," উত্তেজিত হয়ো না"));
        list.add(new DetailsInfo(4,"Don't give it to me","আমার কাছে ইহা দিও না"));
        list.add(new DetailsInfo(5,"Don't lose control"," নিয়ন্ত্রণ হারিয়ে ফেলো না"));
        list.add(new DetailsInfo(6,"Don't lose touch","যোগাযোগ রেখ/ ভুলে যেও না"));
        list.add(new DetailsInfo(7,"Don't make me do it","আমাকে দিয়ে এ কাজ করিও না"));
        list.add(new DetailsInfo(8,"Don't move so much","খুব ঘোরাঘুরি করো না"));
        list.add(new DetailsInfo(9,"Don't talk big","লম্বা কথা বলো না"));
        list.add(new DetailsInfo(10,"Don't think for me","আমার জন্য চিন্তা করো না"));
        list.add(new DetailsInfo(11,"Don't waste your time","সময় নষ্ট করো না"));
        list.add(new DetailsInfo(12,"You are always welcome ","যখন খুশি আসবেন"));

        return list;
    }

    private ArrayList<DetailsInfo> english4()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"What more can I say besides this?","এছাড়া আমি আর কি করতে পারি"));
        list.add(new DetailsInfo(2,"I feel rather dizzy","আমার মাথা ঝিমঝিম করছে"));
        list.add(new DetailsInfo(3,"I shall enquire after you every month","মাসে মাসে আমি তোমার খবর নিব"));
        list.add(new DetailsInfo(4,"To which party does he belong? ","সে কোন পক্ষীয় লোক"));
        list.add(new DetailsInfo(5,"The rich alone are happy","ধনী লোকেরাই সুখী"));
        list.add(new DetailsInfo(6,"Feed the young boys","ছোট ছোট ছেলেদের খেতে দাও"));
        list.add(new DetailsInfo(7,"The exam will begin in the early part of January","জানুয়ারি মাসের প্রথমে পরীক্ষা শুরু হবে"));
        list.add(new DetailsInfo(8,"Either take it or leave it","হয় ইহা গ্রহণ কর নয় বর্জন কর"));
        return list;
    }

    private ArrayList<DetailsInfo> english5()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1," As brisk as butterfly","প্রজাপতির মত চঞ্চল"));
        list.add(new DetailsInfo(2,"As busy as bee","মৌমাসির মত ততপর"));
        list.add(new DetailsInfo(3," As brave as lion","শিংহের মত সাহসী"));
        list.add(new DetailsInfo(4,"As clear as day","দিনের আলোর মত পরিস্কার"));
        list.add(new DetailsInfo(5,"As cunning as a fox","শেয়ালের মত ধুর্ত"));
        list.add(new DetailsInfo(6,"As fair as a rose","গোলাপের মত সুন্দর"));
        list.add(new DetailsInfo(7,"As fierce as a tiger","বাঘের মত ভয়ংকর"));
        list.add(new DetailsInfo(8,"As free as air","বাতাসের মত স্বাধীন"));
        list.add(new DetailsInfo(9,"As fresh as a rose","গোলাপের মত সতেজ"));
        list.add(new DetailsInfo(10,"As grave as a judge","বিচারকের মত গম্ভীর"));
        list.add(new DetailsInfo(11,"As greedy as wolf","নেকড়ের মত লোভী"));
        list.add(new DetailsInfo(12,"As hoarse as crow","কাকের মত কর্কশ"));
        list.add(new DetailsInfo(13,"As light as feather","পালকের মত হালকা"));
        list.add(new DetailsInfo(14,"As playful as kitten","বিড়াল ছানার মত ক্রীড়ামোদী"));
        list.add(new DetailsInfo(15,"As silly as sheep","খরগোশের মত বোকা"));
        return list;
    }

    private ArrayList<DetailsInfo> english6()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Can you speak English?","তুমি কি ইংরেজি বলতে পার?"));
        list.add(new DetailsInfo(2," Do you study English?","তুমি কি ইংরেজি পড়?"));
        list.add(new DetailsInfo(3,"Opinions differ on this subject","এ বিষয়ে মতভেদ আছে।"));
        list.add(new DetailsInfo(4,"I have left no stone unturned","আমি চেষ্টার আর কিছু বাকি রাখিনি।"));
        list.add(new DetailsInfo(5,"One shallow does not make a summer","এক মাঘে শীত যায় না।"));
        list.add(new DetailsInfo(6,"It takes two to make a quarrel","এক হাতে তালি বাজে না।"));
        list.add(new DetailsInfo(7,"You are a man after my heart","তুমি আমার মনের মানুষ।"));
        list.add(new DetailsInfo(8,"Have it your way ","তোমার যেভাবে ইচ্ছা সেভাবে কর।"));
        list.add(new DetailsInfo(9,"Are you getting me?","আমার কথা কি বুঝতে পারছো?"));
        list.add(new DetailsInfo(10,"Do you take credit cards?","তুমি ক্রেডিট কার্ডে দাম নাও?"));
        list.add(new DetailsInfo(11,"Do you think it'll rain today? ","তোমার কি মনে হয় আজ বৃষ্টি হবে?"));
        list.add(new DetailsInfo(12,"Do you think it's possible? ","তুমি কি মনে কর এটা সম্ভব?"));
        list.add(new DetailsInfo(13,"Do you think you'll be back by 11:30? ","তোমার কি মনে হয় কাল সাড়ে এগারটার মধ্যে ফিরতে পারবে ?"));
        list.add(new DetailsInfo(14,"Do you understand?","তুমি বুঝতে পারছ?"));

        return list;
    }

    private ArrayList<DetailsInfo> english7()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Give me a hand","আমাকে একটু সাহায্য করো"));
        list.add(new DetailsInfo(2,"Let me do it myself","আমাকে একাই করতে দাও"));
        list.add(new DetailsInfo(3,"It's a wonder for me","এটা আমার জন্য একটা বিস্ময়"));
        list.add(new DetailsInfo(4,"Can you guess what I'm gonna tell you now?","ভাবতে পারো এখন আমি তোমাকে কি বলবো?"));
        list.add(new DetailsInfo(5,"So far so good","এ পর্যন্ত ভালই চলছে।"));
        list.add(new DetailsInfo(6,"Pen through the second line","দ্বিতীয় লাইনটা কেটে দাও।"));
        list.add(new DetailsInfo(7,"His name has been struck off","তার নাম কাটা গেল।"));
        list.add(new DetailsInfo(8,"He is having a very hard time","তিনি বড় কষ্টে সময় কাটাচ্ছেন।"));
        list.add(new DetailsInfo(9,"The fire has blazed up","আগুন জ্বলে উঠেছে।"));
        list.add(new DetailsInfo(10,"Where do you put up? ","তুমি কোথায় থাক?"));

        return list;
    }

    private ArrayList<DetailsInfo> english8()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"How many ? ","কতগুলো ?"));
        list.add(new DetailsInfo(2,"How much ?"," কি পরিমাণ ?"));
        list.add(new DetailsInfo(3,"How often  ?","কতদিন ? / কত সময় পর ?\""));
        list.add(new DetailsInfo(4,"How far ? ","কতদূর ?"));
        list.add(new DetailsInfo(5,"How fare ?","কত ভাড়া ?"));
        list.add(new DetailsInfo(6,"How long ?","কতক্ষণ ?"));
        list.add(new DetailsInfo(7,"How fast ?","কত দ্রুত ?"));
        list.add(new DetailsInfo(8,"How dare ?","কোন সাহসে ?"));
        list.add(new DetailsInfo(9,"How much longer ?","আর কতক্ষণ ?"));
        list.add(new DetailsInfo(10,"How quickly ","কত দ্রুত ?"));

        return list;
    }

    private ArrayList<DetailsInfo> english9()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Eat","খাওয়া\""));
        list.add(new DetailsInfo(2,"Drink","পান করা"));
        list.add(new DetailsInfo(3,"Suck","চুষে খাওয়া\""));
        list.add(new DetailsInfo(4,"Lick","লেহন করা বা চাটা"));
        list.add(new DetailsInfo(5,"Bite","কামড়ানো"));
        list.add(new DetailsInfo(6,"Swallow","গিলে ফেলা"));
        list.add(new DetailsInfo(7,"Sip","চুমুক দেওয়া"));
        list.add(new DetailsInfo(8,"Taste","আস্বাদন করা"));
        list.add(new DetailsInfo(9,"Chew","চিবানো"));
        list.add(new DetailsInfo(10,"Bite off ","কামড়ে ছিঁড়ে নেওয়া"));
        list.add(new DetailsInfo(11,"Eat voraciously","গোগ্রাসে খাওয়া"));
        list.add(new DetailsInfo(12,"Eat like a bird","অল্পখাওয়া"));
        list.add(new DetailsInfo(13,"Throw up ","বমি করা"));
        list.add(new DetailsInfo(14,"Eat too much","অত্যধিক আহার করা"));
        list.add(new DetailsInfo(15,"Vegetarian","নিরামিষভোজী"));
        list.add(new DetailsInfo(16,"Breakfast","সকালের নাস্তা"));
        list.add(new DetailsInfo(17,"Lunch","দুপুরের খাবার"));
        list.add(new DetailsInfo(18,"Dinner","রাতের খাবার"));
        list.add(new DetailsInfo(20,"Supper ","দিনের শেষ খাবার"));
        list.add(new DetailsInfo(21,"Feast","আনন্দময় ভোজ"));
        list.add(new DetailsInfo(22,"Starve","অনাহারে কাটানো"));
        list.add(new DetailsInfo(23,"Fast","রোজা রাখা"));
        list.add(new DetailsInfo(24,"Overeat","পরিমাণে বেশী খাওয়া"));
        list.add(new DetailsInfo(25,"Go without food","না খেয়ে থাকা।"));
        return list;
    }

    private ArrayList<DetailsInfo> english10()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Don't be impractical ","ধৈর্য্য হারা হয়ো না"));
        list.add(new DetailsInfo(2,"Don't break the rules ","নিয়ম ভঙ্গ কর না"));
        list.add(new DetailsInfo(3,"Don't get excited ","উত্তেজিত হয়ো না"));
        list.add(new DetailsInfo(4,"Don't give it to me","আমার কাছে ইহা দিও না"));
        list.add(new DetailsInfo(5,"Don't lose control","নিয়ন্ত্রণ হারিয়ে ফেলো না"));
        list.add(new DetailsInfo(6,"Don't lose touch","যোগাযোগ রেখ/ ভুলে যেও না"));
        list.add(new DetailsInfo(7,"Don't make me do it ","আমাকে দিয়ে এ কাজ করিও না"));
        list.add(new DetailsInfo(8,"Don't move so much","খুব ঘোরাঘুরি করো না"));
        list.add(new DetailsInfo(9,"Don't talk big","লম্বা কথা বলো না"));
        list.add(new DetailsInfo(10,"Don't think for me","আমার জন্য চিন্তা করো না"));
        list.add(new DetailsInfo(11,"Don't waste your time","সময় নষ্ট করো না"));
        list.add(new DetailsInfo(12,"You are always welcome","যখন খুশি আসবেন"));
        return list;
    }

    private ArrayList<DetailsInfo> english11()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Man becomes beautiful by character","চরিত্র দ্বারাই মানুষ সুন্দর হয়।"));
        list.add(new DetailsInfo(2,"White or fair isn't meant beautiful","সাদা বা ফর্সা মানেই কিন্তু সুন্দর নয়।"));
        list.add(new DetailsInfo(3,"And black isn't meant ill shaped","আর কালো মানেই কিন্তু কুৎসিত নয়।"));
        list.add(new DetailsInfo(4,"Enshrouding cloth is white but blatant","কাফনের কাপড় সাদা কিন্তু ভয়ানক।"));
        list.add(new DetailsInfo(5,"Kabaghar is black but wonderful","কাবা ঘর কালো কিন্তু অপরূপ।"));
        list.add(new DetailsInfo(6,"Men's beauty is not outer views","মানুষের সৌন্দর্য বাহ্যিক দৃশ্যে নয়।"));
        return list;
    }

    private ArrayList<DetailsInfo> english12()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"If you fall asleep thinking of me","ঘুমিয়ে পড় যদি আমায় ভেবে"));
        list.add(new DetailsInfo(2,"If you float on a dream seeing me","স্বপ্নে ভাসো যদি আমায় দেখে"));
        list.add(new DetailsInfo(3,"If you keep me in your mind ","হৃদয় মাঝে যদি রাখো গো আমায়"));
        list.add(new DetailsInfo(4,"Being the morning bird I will sing a song for you","ভোরের পাখি হয়ে গান শোনাব তোমায়"));
        list.add(new DetailsInfo(5,"In the solitude covered with green","সবুজে ছাওয়া এই নির্জনতায়"));
        list.add(new DetailsInfo(6,"Love me a little more","একটু আরো ভালোবাসো না আমায়"));
        list.add(new DetailsInfo(7,"with your soggy lips me","সিক্ত তোমার ঐ অধরে আমায়"));
        list.add(new DetailsInfo(8,"Touch me with the touches of love","দাও না ছুঁয়ে ওগো প্রেমের ছোঁয়ায়"));
        list.add(new DetailsInfo(9,"If you let me come to close","নিভির করে যদি রাখো গো আমায়"));
        list.add(new DetailsInfo(10,"Being the morning bird I will sing a song for you","ভোরের পাখি হয়ে গান শোনাব তোমায়"));
        list.add(new DetailsInfo(11,"If your eyes shed tears","দু’চোখ ঝরে যদি অশ্রুধারায়"));
        list.add(new DetailsInfo(12,"If your sight get lost by the shadow of grief","দৃষ্টি হারায় যদি বিষাদ ছায়ায়"));
        list.add(new DetailsInfo(13,"Forgetting the sad memories far away","দুঃখ স্মৃতি ভুলে দূর অজানায়"));
        list.add(new DetailsInfo(14,"Find out me in your happiness","সুখের মাঝে খুঁজে নিও গো আমায়"));
        list.add(new DetailsInfo(15,"If you hold me tight in your arms","বুকেতে জড়িয়ে যদি রাখো গো আমায়"));
        list.add(new DetailsInfo(16,"Being the morning bird I will sing a song for you","ভোরের পাখি হয়ে গান শোনাব তোমায়"));
        return list;
    }

    private ArrayList<DetailsInfo> english13()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I Don't believe any girl anymore","আমি আর কোনো মেয়েকে বিশ্বাস করিনা।"));
        list.add(new DetailsInfo(2,"I wanted a pure Love","একটা নির্ভেজাল ভালবাসা চেয়েছিলাম।"));
        list.add(new DetailsInfo(3,"However","যাই হউক"));
        list.add(new DetailsInfo(4,"May I say something?","আমি কিছু বলতে পারি?"));
        list.add(new DetailsInfo(5,"Don't worry about me","আমার জন্য চিন্তিত হবেন না।"));
        list.add(new DetailsInfo(6,"We are grateful to you ","আমরা আপনার প্রতি ঋণি।"));
        list.add(new DetailsInfo(7,"Please stay a little more","আরো একটু থাকুন"));
        list.add(new DetailsInfo(8,"Thank you for your good advice","আপনার উত্তম উপদেশের জন্য ধন্যবাদ।"));
        list.add(new DetailsInfo(9,"I am at your service","আমি আপনার সেবায় আছি।"));
        list.add(new DetailsInfo(10,"Excuse me for the trouble","কষ্টের জন্য ক্ষমা চাইছি।"));
        list.add(new DetailsInfo(11," I have been taken aback at your conduct","তোমার আচরণ দেখে আর্শ্চাযান্বিত হয়েছি।"));
        list.add(new DetailsInfo(12,"I don't care for a man of straw like you","তোমার মত অপদার্থকে কেয়ার করিনা।"));
        list.add(new DetailsInfo(13,"What a pest","কি যন্ত্রণা?"));
        list.add(new DetailsInfo(14,"How dare you act so","তুমি কিভাবে এরূপ করতে সাহস কর?"));
        list.add(new DetailsInfo(15,"Are you not ashamed of your conduct","তুমি কি তোমার ব্যবহারের জন্য লজ্জিত নও?"));
        list.add(new DetailsInfo(16,"Shame on you ","ধিক তোমাকে!"));
        list.add(new DetailsInfo(17,"When will you come to your sense","কবে তোমার বুদ্ধি হবে?"));
        list.add(new DetailsInfo(18,"It is you who are to blame","তুমীই দোষী।"));
        list.add(new DetailsInfo(20,"you are good for nothing","তুমি কোন কাজের নও।"));
        list.add(new DetailsInfo(21,"Will you be quiet","আপনি শান্ত হতে হবে"));
        return list;
    }

    private ArrayList<DetailsInfo> english14()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"You are the twinkle of eyes","তুমি আমার চোখের পলক"));
        list.add(new DetailsInfo(2,"The smile of my lips","আমার ঠেটের হাসি"));
        list.add(new DetailsInfo(3,"The joy of my face","আমার মুখের আনন্দ"));
        list.add(new DetailsInfo(4,"Without you I am incomplete","তুমি ছাড়া আমি অসম্পূর্ণ"));
        list.add(new DetailsInfo(5,"That is why I care for you","সে জন্য আমি তোমার ধার ধারি"));
        list.add(new DetailsInfo(6,"Please come in","অনুগ্রহকরে ভেতরে আসুন"));
        list.add(new DetailsInfo(7,"Please count this for me ","অনুগ্রহকরে একটু গণনা করে দিবেন?"));
        list.add(new DetailsInfo(8,"Please fill out this form ","অনুগ্রহকরে ফরমটি ফিলআপ করুন"));
        list.add(new DetailsInfo(9,"Please sit down","অনুগ্রহকরে বসুন"));
        list.add(new DetailsInfo(10,"Please speak English ","অনুগ্রহকরে ইংরেজিতে বলুন"));
        list.add(new DetailsInfo(11,"Please speak more slowly ","অনুগ্রহকরে একটু ধীরে বলুন"));
        return list;
    }

    private ArrayList<DetailsInfo> english15()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"One thorn drives away another","কাঁটা দিয়ে কাঁটা তোলা।"));
        list.add(new DetailsInfo(2,"Shallow knowledge turns one's head","অল্পবিদ্যা ভয়ঙ্করী।"));
        list.add(new DetailsInfo(3,"Look before you leap","দেখে শুনে পা বাড়াও।"));
        list.add(new DetailsInfo(4,"Make a mountain of a mole hil","তিলকে তাল করা।"));
        list.add(new DetailsInfo(5,"Success leads to success","জলেই জল বাঁধে।"));
        list.add(new DetailsInfo(6,"Beggar may sing before a pick-pocket","ন্যাংটার নেই বাটপারের ভয়।"));
        list.add(new DetailsInfo(7,"Beggars must not be choosers","ভিক্ষার চাল কাঁড়া আর আকাড়াঁ।"));
        list.add(new DetailsInfo(8,"Oil your own machine","আপন চরকায় তেল দাও।"));
        list.add(new DetailsInfo(9,"Many a little make a mickle ","রাই কুড়াতে কুড়াতে বেল হয়।"));
        list.add(new DetailsInfo(10,"Many drops make a shower ","বিন্দু বিন্দু জলে সিন্ধু হয়।"));
        list.add(new DetailsInfo(11,"Misfortune never comes alone","বিপদ কখনো একা আসে না।"));
        list.add(new DetailsInfo(12,"Necessity is the mother of invention","প্রয়োজনই আবিস্কারের প্রসুতি।"));
        list.add(new DetailsInfo(13,"Nero fiddles while Rome burns","কারো পৌষমাস , কারো সর্বনাশ ।"));
        list.add(new DetailsInfo(14,"No pains , no gain","কষ্ট না করলে কেষ্ট মেলে না।"));
        list.add(new DetailsInfo(15,"Build castle in the air","আকাশ কুসুম রচনা করা।"));
        list.add(new DetailsInfo(16,"A cat has nine lives ","কই মাছের প্রাণ শক্ত বড়।"));
        list.add(new DetailsInfo(17,"Charity begins at home","আগে ঘর তবে তো পর।"));

        return list;
    }

    private ArrayList<DetailsInfo> english16()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I want to send this book to Bangladesh","আমি এই বইটি বাংলাদেশে পাঠাতে চাই"));
        list.add(new DetailsInfo(2,"My book has been stolen","আমার বইটি চুরি হয়ে গেছে"));
        list.add(new DetailsInfo(3,"One ticket to Bangladesh please","বাংলাদেশের একটি টিকেট দিন"));
        list.add(new DetailsInfo(4,"I usually drink tea at breakfast ","আমি সকালের নাস্তায় সাধারণত চা খাই"));
        list.add(new DetailsInfo(5,"His cell phone doesn't work","তার মুঠোফোন কাজ করছে না ।"));
        list.add(new DetailsInfo(6,"How do you spell it ?","এটাকে তুমি কিভাবে বানান করবে ?"));
        list.add(new DetailsInfo(7,"You can help him","তুমি তাকে সাহায্য করতে পার।"));
        list.add(new DetailsInfo(8,"You could help him","তুমি তাকে সাহায্য করতে পারতে।"));
        list.add(new DetailsInfo(9,"Can you tell me when he leaves home?","তুমি কি বলতে পার কখন সে বাসা থেকে বের হয়?"));
        list.add(new DetailsInfo(10,"Could you tell me when he left home?","তুমি কি বলতে পারতে কখন সে বাসা থেকে বের হয়েছিল?"));
        list.add(new DetailsInfo(11,"I can reach in time ","আমি সময়মত পৌঁছতে পারি।"));
        list.add(new DetailsInfo(12,"I could reach in time","আমি সময়মত পৌঁছতে পারতাম।"));

        return list;
    }

    private ArrayList<DetailsInfo> english17()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"You will move and die","নড়েছ কি মরেছ।"));
        list.add(new DetailsInfo(2,"Don't be so fishy","এত সন্দেহ করো না।"));
        list.add(new DetailsInfo(3,"Have your say","তোমার কথা বল।"));
        list.add(new DetailsInfo(4,"Say something, don't be quiet","কিছু বল, চুপ করে থেকো না।"));
        list.add(new DetailsInfo(5,"I have nothing to say","আমার কিছু বলার নেই।"));
        list.add(new DetailsInfo(6,"How much does this cost?","এটার দাম কত?"));
        list.add(new DetailsInfo(7,"How much does it cost per day?","প্রতিদিন কত খরচ হবে?"));
        list.add(new DetailsInfo(8,"How much do I owe you?","আমি তোমার কাছে কত টাকা ঋনী?"));
        list.add(new DetailsInfo(9,"How much altogether?","সব মিলিয়ে কত?"));
        list.add(new DetailsInfo(10,"How many people do you have in your family? ","তোমার পরিবারের সদস্যসংখ্যা কত ?"));
        list.add(new DetailsInfo(11,"How much are these earrings? ","এই দুল জোড়ার দাম কত?"));
        list.add(new DetailsInfo(12,"How much is it to go to Dhaka?","ঢাকা যেতে কত টাকা লাগবে?"));
        list.add(new DetailsInfo(13,"Do you need anything else?","তোমার আর কিছু লাগবে?"));
        list.add(new DetailsInfo(14,"Do you know what this says? ","তুমি কি জান এটা কি বোঝায়?"));
        list.add(new DetailsInfo(15,"Do you like your boss?","তুমি তোমার বসকে পছন্দ কর?"));
        list.add(new DetailsInfo(16,"Do you play any sports? ","তুমি কি কোন খেলাধুলা কর?"));
        return list;
    }

    private ArrayList<DetailsInfo> english18()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Lunch is on me","লাঞ্চের টাকা আমি দেব।"));
        list.add(new DetailsInfo(2,"I'm sorry if I have kept you","তোমাকে বসিয়ে রাখার জন্য দুঃখিত।"));
        list.add(new DetailsInfo(3,"Good riddance! ","যাক বাঁচা গেল।"));
        list.add(new DetailsInfo(4,"You have to account for your absence","তোমার অনুপস্থিতির জন্য জবাবদিহিকরতে হবে"));
        list.add(new DetailsInfo(5,"For an instance ","উদাহরণ স্বরূপ।"));
        list.add(new DetailsInfo(6,"When you get real love","যখন তুমি সত্যিকারের ভালোবাসা পাও"));
        list.add(new DetailsInfo(7,"Learn to respect that","তাঁকে সম্মান করতে শিখ"));
        list.add(new DetailsInfo(8,"Never lose that in any situation!","কোন পরিস্থিতিতে তাঁকে হারিয়ে যেতে দিওনা"));
        list.add(new DetailsInfo(9,"Cause, what you got easily today","কারণ আজ যা তুমি সহজে পেলে"));
        list.add(new DetailsInfo(10,"Perhaps, you won't get that in exchange of thousand of tears tomorro","হয়ত কাল তা তুমি হাজার কাঁদলেওপাবে না"));

        return list;
    }

    private ArrayList<DetailsInfo> english19()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"As you know ","আপনারা জানেন"));
        list.add(new DetailsInfo(2,"As far as I'm concerned","আমার মতে"));
        list.add(new DetailsInfo(3,"According to one's version","বর্ণনা মোতাবেক"));
        list.add(new DetailsInfo(4,"Cut a good figure","ভাল করা"));
        list.add(new DetailsInfo(5,"Do one's best","যথাসাধ্য চেষ্টা করা"));
        list.add(new DetailsInfo(6,"Every now and then ","মাঝে মাঝে"));
        list.add(new DetailsInfo(7,"Have every right to","যথেষ্ট অধিকার আছে"));
        list.add(new DetailsInfo(8,"How come","কী ব্যাপার?"));
        list.add(new DetailsInfo(9,"How about","কেমন হয়?"));
        list.add(new DetailsInfo(10,"How so","তা কি করে হয়?"));
        list.add(new DetailsInfo(11,"How else","আর কি ভাবে?"));
        list.add(new DetailsInfo(12,"If you do care","যদি আপনি চান"));
        list.add(new DetailsInfo(13,"In my opinion","আমার মতে"));
        list.add(new DetailsInfo(14,"Little by little ","ক্রমান্বয়ে"));
        list.add(new DetailsInfo(15,"I tend to think","আমার কেন যেন মনে হয়"));
        list.add(new DetailsInfo(16,"Next to nothing ","না বললেও চলে"));
        list.add(new DetailsInfo(17,"On my part","আমার তরফ থেকে"));

        return list;
    }

    private ArrayList<DetailsInfo> english20()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Hang on a moment","একটু অপেক্ষা কর"));
        list.add(new DetailsInfo(2,"I'll be back in a moment","আমি এক্ষুণি আসছি।"));
        list.add(new DetailsInfo(3,"I'll go tomorrow ","আমি আগামি কাল যাবো।"));
        list.add(new DetailsInfo(4,"You are right","তুমি ঠিক বলেছো।"));
        list.add(new DetailsInfo(5,"Too right","একদম ঠিক।"));
        list.add(new DetailsInfo(6,"Not really","আসলে তা নয়।"));
        list.add(new DetailsInfo(7,"That's the thing ","সেটাই"));
        list.add(new DetailsInfo(8,"true enough","যতেষ্ট সত্য।"));
        list.add(new DetailsInfo(9,"That's quite right","সেটা ঠিক।"));
        list.add(new DetailsInfo(10,"That's wrong, surely ","এটা নিশ্চয় ভুল বলেছো।"));

        return list;
    }

    private ArrayList<DetailsInfo> english21()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"What ?","কি ?"));
        list.add(new DetailsInfo(2,"Why ?  ","কেন ?"));
        list.add(new DetailsInfo(3,"Whom ?","কাকে ?"));
        list.add(new DetailsInfo(4,"How ?","কিভাবে ? / কেমন ?"));
        list.add(new DetailsInfo(5,"Where ? :"," কোথায় ?"));
        list.add(new DetailsInfo(6,"When ? ","কখন ?"));
        list.add(new DetailsInfo(7,"Which ?","কোনটি ?"));
        list.add(new DetailsInfo(8,"Whose ?  ","কারটি ?"));
        list.add(new DetailsInfo(9,"Who ? ","কে ?"));
        list.add(new DetailsInfo(10,"Who ? ","কে কে ?"));
        return list;
    }

    private ArrayList<DetailsInfo> english22()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I don't have any money","আমার কাছে একটাও টাকা নাই।"));
        list.add(new DetailsInfo(2,"I don't have enough money","আমার যথেষ্ট টাকা নাই।"));
        list.add(new DetailsInfo(3,"I don't have time right now ","ঠিক এ মুহুর্ত্তে আমার সময় নাই।"));
        list.add(new DetailsInfo(4,"I don't mind ","আমি কিছু মনে করিনি।"));
        list.add(new DetailsInfo(5,"I don't know how to use it","এটা কিভাবে ব্যবহার করতে হয় আমি জানিনা"));
        list.add(new DetailsInfo(6,"I don't feel well","আমার ভালো লাগছেনা।"));
        list.add(new DetailsInfo(7,"I don't have a girlfriend","আমার কোন বান্ধবি নাই।"));
        list.add(new DetailsInfo(8,"I don't like him ","আমি তাকে পছন্দ করিনা।"));
        list.add(new DetailsInfo(9,"Whom are you speaking of?","আপনি কার কথা বলেছেন?"));
        list.add(new DetailsInfo(10,"When you walk in my shoes, you might understand","যখন তুমি আমার অবস্থানে থাকবে তখন বুঝবে।"));
        list.add(new DetailsInfo(11,"I don’t know what his name is","তার নাম কি আমি জানি না।"));
        list.add(new DetailsInfo(12,"You are cordially invited","তোমাকে আন্তরিক নিমন্ত্রণ রইল।"));
        list.add(new DetailsInfo(13,"Your shoe is creaking ","তোমার জুতাটা মচ-মচ করছে।"));
        return list;
    }

    private ArrayList<DetailsInfo> english23()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Please let me finish :","আমাকে শেষ করতে দাও "));
        list.add(new DetailsInfo(2,"Please never forget me ","আমাকে কখনও ভুলো না"));
        list.add(new DetailsInfo(3,"Please be ready ","তৈরি হও"));
        list.add(new DetailsInfo(4,"Be brave ","সাহসী হও"));
        list.add(new DetailsInfo(5,"Be enthusiastic","উদ্ধমী হও"));
        list.add(new DetailsInfo(6,"Not at all","মোটেও না"));
        list.add(new DetailsInfo(7,"Listen to me","আমার কথা শুনো"));
        list.add(new DetailsInfo(8,"Please let me explain ","আমাকে ব্যাখ্যা করতে দাও"));
        list.add(new DetailsInfo(9,"Please never mind","কিছু মনে করো না"));
        list.add(new DetailsInfo(10,"Respect your parents","পিতামাতাকে শ্রদ্ধা করো"));
        list.add(new DetailsInfo(11,"Follow me","আমাকে অনুসরণ করো"));
        list.add(new DetailsInfo(12,"You are crossing the limit","তুমি সীমা ছাড়িয়ে যাচ্ছো"));
        list.add(new DetailsInfo(13,"Enjoy your life","জীবন উপভোগ করো"));
        list.add(new DetailsInfo(14,"Don't be egoist ","অহংকারী হইও না"));
        list.add(new DetailsInfo(15,"Good day to you ","তোমার দিন শুভ হোক"));
        list.add(new DetailsInfo(16,"May you be happy","তুমি সুখে থাকো"));
        list.add(new DetailsInfo(17,"Cheer you ","ভালো থেকো"));
        list.add(new DetailsInfo(18,"Bless you","তোমাকে আশির্বাদ"));
        list.add(new DetailsInfo(20,"You should be ashamed","তোমার লজ্জা থাকা উচিত"));
        list.add(new DetailsInfo(21,"I am satisfied ","আমি সন্তুষ্ট"));
        list.add(new DetailsInfo(22,"Don't talk too much","বেশি কথা বলো না"));

        return list;
    }

    private ArrayList<DetailsInfo> english24()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I have written a love letter for you","আমি তোমার জন্যএকটা প্রেম পত্রলিখিয়াছি"));
        list.add(new DetailsInfo(2,"Will you accept my love letter","তুমি কি আমার প্রেম পত্র গ্রহণ করবে?"));
        list.add(new DetailsInfo(3,"I love you so much","আমি তোমায় অনেক ভালোবাসি"));
        list.add(new DetailsInfo(4,"But I can not say","কিন্তু বলতে পারি না"));
        list.add(new DetailsInfo(5,"I'll love you for good","আমি তোমাকে চিরকাল ভালোবাসবো"));
        list.add(new DetailsInfo(6,"Please believe me","অনুগ্রহ করে আমাকে বিশ্বাস করো"));
        list.add(new DetailsInfo(7,"my love is true","আমার ভালোবাসাসত্যি"));
        list.add(new DetailsInfo(8,"If my love is true","যদি আমার ভালোবাসা সত্যি হয়"));
        list.add(new DetailsInfo(9," I'll come by you one day or other","আমি তোমায় কোনো না কোনো একদিন পাবো"));
        list.add(new DetailsInfo(10,"I think love is heaven","আমি মনেকরি,ভালোবাসা স্বর্"));
        list.add(new DetailsInfo(11," I know you won't be able to say now ","আমি জানি তুমি এখন বলতে পারবে না"));
        list.add(new DetailsInfo(12,"But you can sayafter some days","কিন্তু কিছু দিন পরবলতে পারো"));
        list.add(new DetailsInfo(13,"I'll wait for you","আমি তোমার জন্যঅপেক্ষা করবো"));
        return list;
    }

    private ArrayList<DetailsInfo> english25()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"So what?","তাতে কি?"));
        list.add(new DetailsInfo(2,"Who cares!"," কার কি যায় আসে!"));
        list.add(new DetailsInfo(3,"I don’t care!"," আমি পরোয়া করি না"));
        list.add(new DetailsInfo(4,"I suppose so","আমারও তাই মনে হচ্ছে।"));
        list.add(new DetailsInfo(5,"How about","কেমন হয়?"));
        list.add(new DetailsInfo(6,"You got it?","তুমি বুঝতে পেরেছো?"));
        list.add(new DetailsInfo(7,"How so","তা কি করে হয়?"));
        list.add(new DetailsInfo(8,"How else","আর কিভাবে?"));
        list.add(new DetailsInfo(9,"In my opinion","আমার মতে"));
        list.add(new DetailsInfo(10,"I don’t mind","আমি কিছু মনে করি না"));
        list.add(new DetailsInfo(11,"Who knows!","কে জানে!"));
        list.add(new DetailsInfo(12,"Absolutely not","একেবারে না।"));
        list.add(new DetailsInfo(13,"Get lost","বিদায় হোন।"));
        list.add(new DetailsInfo(14,"No way","কোন ভাবেই না।"));
        list.add(new DetailsInfo(15,"I’d rather not"," আমি বরং চাই না।"));
        list.add(new DetailsInfo(16,"I don’t want to","আমি চাই না।"));
        list.add(new DetailsInfo(17,"I shall not be able to come","আমি আসতে পারব না।"));
        list.add(new DetailsInfo(18,"Thanks for asking but I’m busy","জিজ্ঞাসা করার জন্য ধন্যবাদ কিন্তু আমি ব্যস্ত আছি।"));

        return list;
    }

    private ArrayList<DetailsInfo> english26()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I would like to go","আমি যেতে চাই "));
        list.add(new DetailsInfo(2,"I would like to meet the manager","আমি ম্যানেজারের সাথে দেখা করতে চাই "));
        list.add(new DetailsInfo(3,"I would like to meet him","আমি তার সাথে দেখা করতে চাই "));
        list.add(new DetailsInfo(4,"I would like to thank you","আমি আপনাকে ধন্যবাদ জানাতে চাই "));
        list.add(new DetailsInfo(5,"I would like to explain myself","আমি নিজেকে ব্যাখা করতে চাই  "));
        list.add(new DetailsInfo(6,"I would like to become a teacher","আমি একজন শিক্ষক হতে চাই  "));
        list.add(new DetailsInfo(7,"I would like to see you more often","আমি আপনাকে প্রায়ই দেখতে চাই"));
        list.add(new DetailsInfo(8,"I would like to meet the manager","আমি ম্যানেজারের সাথে দেখা করতে চাই  "));
        return list;
    }

    private ArrayList<DetailsInfo> english27()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();
        list.add(new DetailsInfo(1,"Do you like flower? ","তুমি কি ফুল পছন্দ কর? "));
        list.add(new DetailsInfo(2,"Do you speak English? ","তুমি কি ইংরেজী বল? "));
        list.add(new DetailsInfo(3,"Do you understand?","তুমি কি বুঝতে পারছ?"));
        list.add(new DetailsInfo(4,"Do you exercise regularly? ","তুমি কি নিয়মিত ব্যায়াম কর? "));
        list.add(new DetailsInfo(5,"Do you think that it’ll rain today?","তোমার কি মনে হয় আজ বৃষ্টি হবে? "));
        list.add(new DetailsInfo(6,"Do you play football every afternoon? ","তুমি কি প্রতিদিন বিকালে ফুটবল খেলো? "));
        list.add(new DetailsInfo(7,"Do you want to go with me? :","তুমি কি আমার সাথে যেতে চাও? "));
        list.add(new DetailsInfo(8,"Do you think it’s going to rain tomorrow? ","তোমার কি মনে হয় আগামীকাল বৃষ্টি হবে?"));
        list.add(new DetailsInfo(9,"Do you study a lot for the examination?","তুমি কি পরীক্ষার জন্য অনেক পড়াশোনা কর?"));
        return list;
    }

    private ArrayList<DetailsInfo> english28()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"The mobile has to be repaired ","মোবাইলটি মেরামত করতে হবে "));
        list.add(new DetailsInfo(2,"The money has to be paid :","টাকাটি পরিশোধ করতে হবে  "));
        list.add(new DetailsInfo(3,"The question has to be corrected ","প্রশ্নটি সংশোধন করতে হবে  "));
        list.add(new DetailsInfo(4,"Parents have to be respected"," পিতামাতাকে সম্মান করতে হবে"));
        list.add(new DetailsInfo(5,"The Shirt has to be washed ","শার্টটি পরিস্কার করতে হবে  "));
        list.add(new DetailsInfo(6,"The poor have to be helped","দরিদ্রদের সাহায্য করতে হবে "));
        list.add(new DetailsInfo(7,"The table has to be cleaned","টেবিলটি পরিস্কার করতে হবে "));

        return list;
    }

    private ArrayList<DetailsInfo> english29()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"May you be happy","তুমি সুখে থাকো"));
        list.add(new DetailsInfo(2,"Stay here","এখানে দাঁড়াও"));
        list.add(new DetailsInfo(3,"I got it","আমি বুঝতে পেরেছি"));
        list.add(new DetailsInfo(4,"Don’t get nosy","নাক গলাবে না"));
        list.add(new DetailsInfo(5,"Hands off from my shoulder","আমার কাঁধ থেকে হাত সরাও"));
        list.add(new DetailsInfo(6,"Track the man down","লোকটাকে ফলো করো"));
        list.add(new DetailsInfo(7,"Show me how","It makes no sense"));
        list.add(new DetailsInfo(8,"It makes no sense","এটার কোন মানে নেই"));
        list.add(new DetailsInfo(9,"Nothing to worry about","এতোটা চিন্তার কিছু নেই"));
        return list;
    }

    private ArrayList<DetailsInfo> english30()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Am I pronouncing it correctly?"," আমি কি সঠিক উচ্চারণ করছি?"));
        list.add(new DetailsInfo(2,"Are they the same?","তারা কি একই রকম?"));
        list.add(new DetailsInfo(3,"Are you okay?","তুমি ঠিক আছতো?"));
        list.add(new DetailsInfo(4,"Are you waiting for someone?","তুমি কারো জন্য অপেক্ষা করছ?"));
        list.add(new DetailsInfo(5,"At what time did it happen?","এটা কখন ঘটলো?"));
        list.add(new DetailsInfo(6,"Can you speak louder please?","অনুগ্রহ করে আরেকটু জোরে বলবেন?"));
        list.add(new DetailsInfo(7,"Did you get my email?","তুমি কি আমার ইমেইল পেয়েছিলে?"));
        list.add(new DetailsInfo(8,"Do you feel better?","ভালো বোধ করছোতো?"));
        list.add(new DetailsInfo(9,"Do you have another one?","তোমার আরো একটা আছে?"));
        list.add(new DetailsInfo(10,"Do you think it’s possible? ","তুমি কি মনে কর এটা সম্ভব?"));
        list.add(new DetailsInfo(11,"Don’t do that","ওটা কারো না"));
        return list;
    }

    private ArrayList<DetailsInfo> english31()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I am grateful to you ","আমি তোমার প্রতি কৃতজ্ঞ।"));
        list.add(new DetailsInfo(2,"Thanks a lot ","অনেক ধন্যবাদ।"));
        list.add(new DetailsInfo(3,"You've done a lot for me","তুমি আমার জন্য অনেক কিছু করেছো।"));
        list.add(new DetailsInfo(4,"That was so kind of you","এটা ছিল তোমার মহানুভবতা।"));
        list.add(new DetailsInfo(5,"Thanks for being helpful","সহায়ক হওয়ার জন্য ধন্যবাদ।"));
        list.add(new DetailsInfo(6,"I will never forget what you have done","তুমি যা করেছো তা আমি কখনই ভুলব না।"));
        list.add(new DetailsInfo(7,"You are invaluable to me","তুমি আমার কাছে অমূল্য।"));
        list.add(new DetailsInfo(8,"I appreciate you for being with me","আমি তোমায় প্রশংসিত করছি আমার সাথে থাকার জন্য।"));
        return list;
    }

    private ArrayList<DetailsInfo> english32()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Don’t be afraid","ভয় পেয়ো না।"));
        list.add(new DetailsInfo(2,"Don’t worry about this","এ ব্যাপারে চিন্তা করোনা। "));
        list.add(new DetailsInfo(3,"Don’t break the rules"," নিয়ম ভেঙ্গো না।"));
        list.add(new DetailsInfo(4,"Don’t tell me lies ","আমাকে মিথ্যা বলোনা।"));
        list.add(new DetailsInfo(5,"Don’t lose my number","আমার নাম্বারটি হারিয়ে ফেলো না।"));
        list.add(new DetailsInfo(6,"Don’t argue with fools","বোকাদের সাথে তর্ক করোনা।"));
        list.add(new DetailsInfo(7,"Don’t forget your manners","তোমার আচরণের কথা ভুলো না।"));
        list.add(new DetailsInfo(8,"Don’t access talk to strangers","অপরিচিত লোকের সাথে অতিরিক্ত কথা বলোনা।"));
        list.add(new DetailsInfo(9,"Don’t make me laugh","আমাকে হাসিও না।"));
        list.add(new DetailsInfo(10,"Don’t break my heart","আমার হৃদয় ভেঙ্গো না।"));
        list.add(new DetailsInfo(11,"Don’t waste your time","তোমার সময় নষ্ট করোনা।"));
        list.add(new DetailsInfo(12,"Don’t give up","চেষ্টা) ছেড়ে দিওনা।"));
        return list;
    }

    private ArrayList<DetailsInfo> english33()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I have to leave","আমাকে যেতে হবে"));
        list.add(new DetailsInfo(2,"I have to sleep","আমাকে ঘুমাতে হবে"));
        list.add(new DetailsInfo(3,"I have to use the mobile","আমাকে মোবাইলটা ব্যবহার করতে হবে"));
        list.add(new DetailsInfo(4,"I have to go to the bathroom","আমাকে বাথরুমে যেতে হবে"));
        list.add(new DetailsInfo(5,"I have to clean my bag","আমাকে আমার ব্যাগটা পরিষ্কার করতে হবে"));
        list.add(new DetailsInfo(6,"I am working on my laptop","আমি আমার ল্যাপটপে কাজ করছি"));
        list.add(new DetailsInfo(7,"I'm working on my website","আমি আমার ওয়েবসাইটে কাজ করছি"));
        list.add(new DetailsInfo(8,"I'm working on a project","আমি একটি প্রজেক্টে কাজ করছি"));
        list.add(new DetailsInfo(9,"I'm working on a research","আমি একটি গবেষনার উপর কাজ করছি"));
        list.add(new DetailsInfo(10,"I'm working on educating myself","আমি নিজেকে শিক্ষিত করার চেষ্টা করছি"));
        return list;
    }

    private ArrayList<DetailsInfo> english34()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Do you feel better?","ভালো বোধ করছোতো?"));
        list.add(new DetailsInfo(2,"Have you done this before?","তুমি কি এটা আগে করেছ?"));
        list.add(new DetailsInfo(3,"He’ll be back in 10 minutes","সে ১০ মিনিটের মধ্যে ফিরে আসবে"));
        list.add(new DetailsInfo(4,"He’s faster than me ","সে আমার চেয়ে দ্র্রুত"));
        list.add(new DetailsInfo(5,"You are smarter than he","তুমি তার চেয়ে বুদ্ধিমান"));
        list.add(new DetailsInfo(6,"He’s very annoying","সে খুবই বিরক্তিকর"));
        list.add(new DetailsInfo(7,"I got sick while at the party/invitation","আমি দাওয়াত খেতে গিয়ে অসুস্থ হয়ে পরেছিলাম।"));
        list.add(new DetailsInfo(8,"If you have the patience, you will be succeed","যদি আপনার ধৈর্য্য থাকে তবে সফল হবেন "));
        return list;
    }

    private ArrayList<DetailsInfo> english35()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"All the best","সর্বাঙ্গীন শুভ কামনা।"));
        list.add(new DetailsInfo(2,"All over","সর্বত্র।"));
        list.add(new DetailsInfo(3,"Again and again ","বারবার।"));
        list.add(new DetailsInfo(4,"A bed of roses ","সুখস্বাচ্ছন্দ্যপূর্ণ জীবন।"));
        list.add(new DetailsInfo(5,"A black sheep","কুলাঙ্গার।"));
        list.add(new DetailsInfo(6,"A rainy day","দুর্দিন।"));
        list.add(new DetailsInfo(7,"After all","সবকিছু সত্ত্বেও।"));
        list.add(new DetailsInfo(8,"A piece of cake","খুবই সহজ।"));
        list.add(new DetailsInfo(9,"Bid fair ","ভালো কিছু আশা করা।"));
        list.add(new DetailsInfo(10,"All at once","হঠাৎ"));
        list.add(new DetailsInfo(11,"By and large","প্রধানত।"));
        list.add(new DetailsInfo(12,"A tall order ","বিশাল ফিরিস্তি।"));
        list.add(new DetailsInfo(13,"Acid test","অগ্নিপরীক্ষা।"));
        list.add(new DetailsInfo(14,"A white lie","ইচ্ছার বিরুদ্ধে।"));
        list.add(new DetailsInfo(16,"For good"," চিরকালের জন্য।"));
        list.add(new DetailsInfo(17,"Far and wide","সর্বত্র।"));
        list.add(new DetailsInfo(18,"By and by","শীঘ্র।"));
        list.add(new DetailsInfo(20,"At last","অবশেষে।"));
        list.add(new DetailsInfo(21,"In time","ঠিক সময়ে।"));

        return list;
    }

    private ArrayList<DetailsInfo> english36()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"We are all in complete shock","আমরা সবাই শোকাহত"));
        list.add(new DetailsInfo(2,"I was astonished","আমি বিস্মিত হয়েছিলাম।"));
        list.add(new DetailsInfo(3,"I was shocked to hear the news","আমি খুব কষ্ট পেয়েছিলাম খবরটা শুনে।"));
        list.add(new DetailsInfo(4,"Who could have predicted it?","কেউ কি এটা আগে থেকে চিন্তা করতে পেরেছিল।"));
        list.add(new DetailsInfo(5,"I just can’t get over","আমি কিছুতেই ভুলতে পারছি না।"));
        list.add(new DetailsInfo(6,"I was just stunned by her clothes","আমি তার পোশাক দেখে হতভম্ব হয়ে গেলাম।"));
        list.add(new DetailsInfo(7,"I just can't believe the terrible news","আমি এ ভয়ঙ্কর সংবাদটি বিশ্বাস করতে পারছি না।"));
        list.add(new DetailsInfo(8,"It happened out of the blue","এটা সম্পূর্ণ অপ্রত্যাশিতভাবেই ঘটেছিল।"));
        list.add(new DetailsInfo(9,"I was completely taken aback by his behavio","তার ব্যবহারে আমি পুরোপুরি বিস্মিত হয়েছিলাম।"));
        list.add(new DetailsInfo(10,"The news came as a complete shock","সংবাদটি যেন একটি বড় আঘাত হয়ে এসেছিল।"));
        list.add(new DetailsInfo(11,"That’s why you need to do the job","এ কারণেই তোমার চাকরিটি করা প্রয়োজন।"));
        list.add(new DetailsInfo(12,"That’s why he has gone to market","এ কারণেই সে বাজারে গিয়েছে।"));
        list.add(new DetailsInfo(13,"That’s why people admire you","এ কারণেই লোকজন আপনাকে সম্মান করে।"));
        list.add(new DetailsInfo(14,"That’s why I always try to help others","এ কারণেই আমি সর্বদা অন্যকে সাহায্য করার চেষ্টা করি।"));
        list.add(new DetailsInfo(15,"That’s why you fail to understand","এ কারণেই তুমি বুঝতে ব্যর্থ হও।"));
        list.add(new DetailsInfo(16,"That’s why we should inform him in time","এ কারণেই তাকে আমাদের সময় মত জানানো উচিৎ।"));
        list.add(new DetailsInfo(17,"That’s why she smiles after seeing you","এ কারণেই তোমাকে দেখার পর সে হাসে।"));
        list.add(new DetailsInfo(18,"That’s why you need to secure your home","এ কারণেই তোমার বাড়ির নিরাপত্তা বিধান করা দরকার।"));
        list.add(new DetailsInfo(20,"That’s why you’ve got the promotion","এ কারণেই তুমি পদোন্নতি পেয়েছো।"));
        return list;
    }

    private ArrayList<DetailsInfo> english37()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"What day of the week is it?"," আজ সপ্তাহের কোন দিন?"));
        list.add(new DetailsInfo(2,"Please never forget me","আমাকে কখনও ভুলো না।"));
        list.add(new DetailsInfo(3,"If you allow me to say","আপনি যদি অনুমতি দেন তবে বলি।"));
        list.add(new DetailsInfo(4,"I have a lot of things to do","আমার অনেক কিছু করার আছে।"));
        list.add(new DetailsInfo(5,"You are going beyond limits","তুমি সীমা ছাড়িয়ে যাচ্ছো। "));
        list.add(new DetailsInfo(6,"I have a headache","আমার মাথা ব্যাথা করছে।"));
        list.add(new DetailsInfo(7,"I promise I will","আমি কথা দিচ্ছি আমি করব"));
        list.add(new DetailsInfo(8,"You can trust me","আমার উপর ভরসা করতে পারেন।"));
        list.add(new DetailsInfo(9,"Do not put me in shame? ","আমাকে লজ্জা দিও না? "));
        return list;
    }

    private ArrayList<DetailsInfo> english38()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Can I sit beside you?","আমি কি আপনার পাশে বসতে পারি?"));
        list.add(new DetailsInfo(2,"They go to school by bus","তারা বাসে চড়ে স্কুলে যায়।"));
        list.add(new DetailsInfo(3,"By nature, he is shy","স্বভাবত সে লাজুক।"));
        list.add(new DetailsInfo(4,"He was standing beside me","সে আমার পাশে দাড়িয়েছিল।"));
        list.add(new DetailsInfo(5,"Please send message by email","দয়া করে ইমেইলে মেসেজটি পাঠান।"));
        list.add(new DetailsInfo(6,"The school is by the new market","স্কুলটি নিউ মার্কেটের পাশে অবস্থিত।"));
        list.add(new DetailsInfo(7,"His house is by the mosque","তার বাড়ি মসজিদের পাশে।"));
        list.add(new DetailsInfo(8,"The Hospital is by the Bank"," হাসপাতালটি ব্যাংকের পাশে অবস্থিত"));
        list.add(new DetailsInfo(9,"He sent a flower by his friend","সে তার বন্ধুর মাধ্যমে একটি ফুল পাঠিয়েছিল।"));
        list.add(new DetailsInfo(10,"He was accompanied by his father","সে তার পিতার সঙ্গী হয়েছিল।"));
        list.add(new DetailsInfo(11,"You should abide by the rules"," তোমার নিয়মাবলি মেনে চলা উচিৎ।\""));
        return list;
    }

    private ArrayList<DetailsInfo> english39()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"So what? ","তাতে কি?"));
        list.add(new DetailsInfo(2,"Who cares!","কার কি যায় আসে!"));
        list.add(new DetailsInfo(3,"I don’t care!","আমি পরোয়া করি না"));
        list.add(new DetailsInfo(4,"I suppose so","আমারও তাই মনে হচ্ছে।"));
        list.add(new DetailsInfo(5,"How about "," কেমন হয়?"));
        list.add(new DetailsInfo(6,"You got it?","তুমি বুঝতে পেরেছো?"));
        list.add(new DetailsInfo(7,"How so","তা কি করে হয়?"));
        list.add(new DetailsInfo(8,"How else "," আর কিভাবে?"));
        list.add(new DetailsInfo(9,"In my opinion","আমার মতে"));
        list.add(new DetailsInfo(10,"I don’t mind","আমি কিছু মনে করি না"));
        list.add(new DetailsInfo(11,"Who knows! ","কে জানে!"));
        return list;
    }

    private ArrayList<DetailsInfo> english40()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Excuse Me ","শুনুন।"));
        list.add(new DetailsInfo(2,"Can you hear me?","আমার কথা শুনছেন?"));
        list.add(new DetailsInfo(3,"Listen to me","আমার কথা শুনুন।"));
        list.add(new DetailsInfo(4,"Hey, got it?"," এই, বুঝতে পেরেছো?"));
        list.add(new DetailsInfo(5,"Oh, come on!","আহ, একটু বুঝতে চেষ্টা করোতো।"));
        list.add(new DetailsInfo(6,"May I have your attention please","আপনি যদি একটু এদিকে নজর দেন।"));
        list.add(new DetailsInfo(7,"Is it clear to you? ","এটা কি তোমার কাছে পরিষ্কার?"));
        list.add(new DetailsInfo(8,"Are you with me?","আমার কথা শুনছেন তো?"));
        list.add(new DetailsInfo(9,"I agree on this matter","আমি এই বিষয়ে একমত"));
        list.add(new DetailsInfo(10,"Attach this file to the email","ইমেইলে এই ফাইলটি সংযুক্ত করুন"));
        list.add(new DetailsInfo(11,"Everyone should abide by the rules","প্রত্যেকের উচিৎ নিয়ম মেনে চলা "));
        list.add(new DetailsInfo(12,"Take care of your health","আপনার স্বাস্থ্যের প্রতি যত্ন নিন"));
        list.add(new DetailsInfo(13,"I do not believe in his honesty","আমি তার সততাকে বিশ্বাস করি না "));
        list.add(new DetailsInfo(14,"Man should aware of the danger of environment pollution","মানুষের উচিৎ পরিবেশ দূষণের বিপদ সম্পর্কে সচেতন হওয়া।"));
        list.add(new DetailsInfo(15,"Success depends on hard work","সাফল্য কঠোর পরিশ্রমের উপর নির্ভর করে"));
        list.add(new DetailsInfo(16,"According to his order I went there","তার আদেশ অনুযায়ী আমি সেখানে গিয়েছিলাম "));
        return list;
    }

    private ArrayList<DetailsInfo> english41()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"How often do you exercise?"," তুমি কতদিন পর পর ব্যায়াম কর। "));
        list.add(new DetailsInfo(2,"How often do you go to doctor for checkup?","তুমি চেকআপের জন্য কতদিন পর পর ডাক্তারের কাছে যাও?"));
        list.add(new DetailsInfo(3,"How often do you visit to your parents?","তুমি কতদিন পর পর তোমার মাবাবার সাথে দেখা কর?"));
        list.add(new DetailsInfo(4,"How often do you change your password?","তুমি কতদিন পর পর তোমার পাসওয়ার্ড পরিবর্তন কর? "));
        list.add(new DetailsInfo(5,"How often do you need facial?","কতদিন পর পর তোমার ফেসিয়াল করা প্রয়োজন হয়? "));
        list.add(new DetailsInfo(6,"How often do you water in flower garden?","কতদিন পর পর তুমি ফুল বাগানে পানি দাও?"));

        return list;
    }

    private ArrayList<DetailsInfo> english42()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"There’s no need to call him ","তাকে ডাকার কোন দরকার নেই।"));
        list.add(new DetailsInfo(2,"There’s no need to bother him ","তাকে বিরক্ত করার কোন দরকার নেই। "));
        list.add(new DetailsInfo(3,"There’s no need to be upset","হতাশ হওয়ার কোন দরকার নেই। "));
        list.add(new DetailsInfo(4,"There’s no need to go back ","ফিরে যাওয়ার কোন দরকার নেই। "));
        list.add(new DetailsInfo(5,"There’s no need to stop now ","এখন বন্ধ করার কোন দরকার নেই। "));
        list.add(new DetailsInfo(6,"There’s no need to tell lies ","মিথ্যা বলার কোন দরকার নেই।  "));
        list.add(new DetailsInfo(7,"There’s no need to be worried ","চিন্তিত হওয়ার কোন দরকার নেই।  "));
        list.add(new DetailsInfo(8,"There’s no need to talk about her ","তার সম্পর্কে কথা বলার কোন দরকার নেই।  "));
        return list;
    }

    private ArrayList<DetailsInfo> english43()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"This is not true","এটা সত্যি নয়। "));
        list.add(new DetailsInfo(2,"I do not agree ","আমি মানি না। "));
        list.add(new DetailsInfo(3,"Don’t be angry","রাগ করবেন না। "));
        list.add(new DetailsInfo(4,"I refuse","আমি প্রত্যাখান করি। "));
        return list;
    }

    private ArrayList<DetailsInfo> english44()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I know nothing in this connection","আমি এই বিষয়ে কিছুই জানিনা। "));
        list.add(new DetailsInfo(2,"I will not participate in this competition","আমি এই প্রতিযোগিতায় অংশগ্রহন করব না।"));
        list.add(new DetailsInfo(3,"I cannot help you","আমি আপনাকে সাহায্য করতে পারব না। "));
        list.add(new DetailsInfo(4,"You should not sleep late"," দেরি করে ঘুমানো উচিৎ না।"));

        return list;
    }

    private ArrayList<DetailsInfo> english45()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Let me check","আমাকে দেখতে দাও  "));
        list.add(new DetailsInfo(2,"Let’s go have a look","চল গিয়ে দেখি "));
        list.add(new DetailsInfo(3,"I have not scolded you","আমি তোমাকে বকিনি "));
        list.add(new DetailsInfo(4,"Has not Rafiq got salary this month? ","রফিক কি এ মাসে বেতন পায়নি?  "));
        list.add(new DetailsInfo(5,"Have you told him the matter? ","তুমিকি তাকে ব্যাপারটা বলেছ? "));
        list.add(new DetailsInfo(6,"Have you broken this pen? ","তুমিকি এই কলমটা ভেঙ্গেছ?   "));
        list.add(new DetailsInfo(7,"Have you heard this news? "," তোমরা কি এই খবরটা শুনেছ?  "));
        list.add(new DetailsInfo(8,"The train has not yet started","ট্রেনটি এখনও ছাড়েনি  "));
        list.add(new DetailsInfo(9,"Has Raju replied to your letter?","রাজু কি তোমার চিঠির উত্তর দিয়েছে?  "));
        list.add(new DetailsInfo(10,"How absurd!","কি বাজে/ কি বিরক্তিকর! "));
        list.add(new DetailsInfo(11,"It seems to be right","এটা ঠিক মনে হয় "));
        list.add(new DetailsInfo(12,"We are all in complete shock ","আমরা সবাই শোকাহত "));
        list.add(new DetailsInfo(13,"I was astonished","আমি বিস্মিত হয়েছিলাম। "));
        list.add(new DetailsInfo(14,"The news came as a complete shock","সংবাদটি যেন একটি বড় আঘাত হয়ে এসেছিল। "));
        list.add(new DetailsInfo(15,"I was shocked to hear the news ","আমি খুব কষ্ট পেয়েছিলাম খবরটা শুনে।"));
        list.add(new DetailsInfo(16,"Who could have predicted it?","কেউ কি এটা আগে থেকে চিন্তা করতে পেরেছিল। "));
        list.add(new DetailsInfo(17,"I just can’t get over","আমি কিছুতেই ভুলতে পারছি না। "));
        list.add(new DetailsInfo(18,"I was just stunned by her clothes ","আমি তার পোশাক দেখে হতভম্ব হয়ে গেলাম।"));
        list.add(new DetailsInfo(20,"I just can't believe the terrible news","আমি এ ভয়ঙ্কর সংবাদটি বিশ্বাস করতে পারছি না।"));
        list.add(new DetailsInfo(21,"I’m coming to pick you up","আমি তোমাকে নিতে আসছি"));
        list.add(new DetailsInfo(22,"I’m getting ready to go out ","আমি বাইরে যাবার জন্য তৈরী হচ্ছি  "));
        list.add(new DetailsInfo(23,"I’m going to go have dinner","আমি রাতের খাবার খেতে যাচ্ছি  "));
        return list;
    }

    private ArrayList<DetailsInfo> english46()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I’m good","আমি ভালো আছি "));
        list.add(new DetailsInfo(2,"I’m just kidding ","আমি ঠাট্টা করছি "));
        list.add(new DetailsInfo(3,"I’m just looking","আমি শুধু দেখছি  "));
        list.add(new DetailsInfo(4,"I’m lost ","আমি হারিয়ে গেছি"));
        list.add(new DetailsInfo(5,"I’m not ready yet","আমি এখনো প্রস্তুত নই "));
        list.add(new DetailsInfo(6,"In 30 minutes","৩০ মিনিটের ভেতর"));
        list.add(new DetailsInfo(7,"Expiration date","মেয়াদ উত্তীর্ণের তারিখ "));
        list.add(new DetailsInfo(8,"Whats wrong? ","সমস্যা কি? "));
        list.add(new DetailsInfo(9,"I'm little bit unhappy  ","আমি কিছুটা অসুখী। "));
        list.add(new DetailsInfo(10,"Are you alright?","তুমি কি ঠিক আছো?  "));
        list.add(new DetailsInfo(11,"You seem depressed Whats the matter?","তোমাকে হতাশ লাগছে। ব্যাপারটা কি? "));
        list.add(new DetailsInfo(12,"Are you OK? ","তুমি কি ঠিক আছো? "));
        list.add(new DetailsInfo(13,"Why do you depressed? "," তুমি হতাশ কেন? "));
        list.add(new DetailsInfo(14,"I feel good ","আমার ভালো লাগছে "));
        list.add(new DetailsInfo(15,"I give up","আমি ছেড়ে দিয়েছি "));
        list.add(new DetailsInfo(16,"I haven’t been there","আমি সেখানে ছিলামনা "));
        list.add(new DetailsInfo(17,"I still haven’t decided about this matter","আমি এ বিষয়ে এখনো সিদ্ধান্ত নিতে পারিনি"));
        list.add(new DetailsInfo(18,"I wish I had one","ইচ্ছা করছে আমারও যদি একটা থাকত "));
        list.add(new DetailsInfo(20,"I’ll have a cup of coffee please ","আমাকে এক কাপ কফি দেবেন "));
        list.add(new DetailsInfo(21,"I’ll take it"," আমি এটা নেবো"));
        list.add(new DetailsInfo(22,"I’ll take that one also","আমি ওটাও নেবো  "));
        list.add(new DetailsInfo(23,"I’ll tell him you called","আমি তাকে বলবো তুমি ফোন করেছিলে  "));
        list.add(new DetailsInfo(24,"I’m bored ","আমি হাপিয়ে উঠেছি  "));
        list.add(new DetailsInfo(25,"I’m coming to pick you up","আমি তোমাকে নিতে আসছি  "));
        return list;
    }

    private ArrayList<DetailsInfo> english47()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I would like to go","আমি যেতে চাই  "));
        list.add(new DetailsInfo(2,"I would like to meet him","আমি তার সাথে দেখা করতে চাই  "));
        list.add(new DetailsInfo(3,"I would like to thank you ","আমি আপনাকে ধন্যবাদ জানাতে চাই  "));
        list.add(new DetailsInfo(4,"I would like to explain myself ","আমি নিজেকে ব্যাখা করতে চাই   "));
        list.add(new DetailsInfo(5,"I would like to become a teacher","আমি একজন শিক্ষক হতে চাই "));
        list.add(new DetailsInfo(6,"I would like to see you more often ","আমি আপনাকে প্রায়ই দেখতে চাই   "));
        list.add(new DetailsInfo(7,"I would like to meet the manager","আমি ম্যানেজারের সাথে দেখা করতে চাই "));
        list.add(new DetailsInfo(8,"I would like to practice"," আমি অনুশীলন করতে চাই   "));
        list.add(new DetailsInfo(9,"I would like to compete in a cooking contest","আমি একটি রান্নার প্রতিযোগিতায় প্রতিদ্বন্দ্বিতা করতে চাই  "));

        return list;
    }

    private ArrayList<DetailsInfo> english48()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Whats happened","কি হয়েছে "));
        list.add(new DetailsInfo(2,"Thats right"," ঠিক বলেছেন  "));
        list.add(new DetailsInfo(3,"definitely","অবশ্যই "));
        list.add(new DetailsInfo(4,"Oh shit"," ধ্যাত্তেরি  "));
        list.add(new DetailsInfo(5,"Keep quiet","চুপ কর "));
        list.add(new DetailsInfo(6,"Its enough","যথেষ্ট হয়েছ "));
        list.add(new DetailsInfo(7,"So be it","তবে তাই হোক  "));
        list.add(new DetailsInfo(8,"Excuse me","এই যে শুনুন  "));
        list.add(new DetailsInfo(9,"That’s fantastic","এটা সত্যি চমৎকার "));
        list.add(new DetailsInfo(10,"really pleased","সত্যি আনন্দিত "));
        list.add(new DetailsInfo(11,"Delighted","নন্দিত"));
        list.add(new DetailsInfo(12,"What an idea!","কি বুদ্ধি!"));
        list.add(new DetailsInfo(13,"What a shame! "," কি লজ্জার কথা! "));
        list.add(new DetailsInfo(14,"Well done","সাবাশ"));
        list.add(new DetailsInfo(15,"Marvelous ","বা বেশ  "));
        list.add(new DetailsInfo(16,"Let me see","আমাকে দেখতে দাও"));
        list.add(new DetailsInfo(17,"Yes go on","হ্যা, বলতে থাক"));
        list.add(new DetailsInfo(18,"Oh sure","ও নিশ্চয়ই "));
        list.add(new DetailsInfo(20,"Wow","বাহ, দারুন তো "));
        list.add(new DetailsInfo(21,"I think so","আমি তাই মনে করি"));
        list.add(new DetailsInfo(22,"Oh come on","আহ! একটু বুঝতে চেষ্টা করো "));
        list.add(new DetailsInfo(23,"Not a bit","একটুও না "));
        list.add(new DetailsInfo(24,"Suppose","মনে করো "));
        list.add(new DetailsInfo(25,"Anybody here","এখানে কেও আছেন  "));
        list.add(new DetailsInfo(26,"Understand","বুঝেছি "));
        list.add(new DetailsInfo(27,"Whats happened ","কি হয়েছে "));
        list.add(new DetailsInfo(28,"Thats right","ঠিক বলেছেন"));
        list.add(new DetailsInfo(29,"definitely","অবশ্যই"));
        list.add(new DetailsInfo(30,"Oh shit","ধ্যাত্তেরি  "));
        list.add(new DetailsInfo(30,"Keep quiet"," চুপ কর "));
        list.add(new DetailsInfo(30,"Its enough","যথেষ্ট হয়েছ "));
        list.add(new DetailsInfo(30,"How Nice!"," কি সুন্দর! "));
        list.add(new DetailsInfo(30,"What nonsense!","কি বাজে বকো! "));
        list.add(new DetailsInfo(30,"Yes, it is"," ঠিকই তো  "));
        list.add(new DetailsInfo(30,"It has been so long","কতদিন পর দেখা "));
        list.add(new DetailsInfo(30,"Wait a little bit"," খানিক অপেক্ষা কর "));
        list.add(new DetailsInfo(30,"So it is"," তাই তো "));
        list.add(new DetailsInfo(30,"Let’s sit somewhere","চল কোথাও বসি "));
        list.add(new DetailsInfo(30,"What about you? ","তোমার কি খবর?"));
        list.add(new DetailsInfo(30,"so so","মোটামোটি  "));
        return list;
    }

    private ArrayList<DetailsInfo> english49()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I'm sorry to be so late"," আমি এত দেরি করার জন্য দুঃখিত "));
        list.add(new DetailsInfo(2,"I'm sorry to hear about your sick mother","আমি আপনার অসুস্থ মা সম্পর্কে শুনে দুঃখিত"));
        list.add(new DetailsInfo(3,"I'm sorry to waste your time","আপনার সময় নষ্ট করার জন্য আমি দুঃখিত "));
        list.add(new DetailsInfo(4,"I'm sorry to make mistake "," ভুল করার জন্য আমি দুঃখিত"));
        list.add(new DetailsInfo(5,"I'm sorry to frighten you ","আমি আপনাকে ভয় দেখানোর জন্য দুঃখিত "));
        list.add(new DetailsInfo(6,"Am I pronouncing it correctly? ","আমি কি সঠিক উচ্চারণ করছি?  "));
        list.add(new DetailsInfo(7,"Are they the same? ","তারা কি একই রকম? "));
        list.add(new DetailsInfo(8,"Are you okay?","তুমি ঠিক আছতো?"));
        list.add(new DetailsInfo(9,"Are you waiting for someone? ","তুমি কারো জন্য অপেক্ষা করছ? "));
        list.add(new DetailsInfo(10,"At what time did it happen? "," এটা কখন ঘটলো? "));
        list.add(new DetailsInfo(11,"Can you speak louder please? ","অনুগ্রহ করে আরেকটু জোরে বলবেন? "));
        list.add(new DetailsInfo(12,"Did you get my email? ","তুমি কি আমার ইমেইল পেয়েছিলে?"));
        list.add(new DetailsInfo(13,"Do you feel better? ","ভালো বোধ করছোতো?"));
        list.add(new DetailsInfo(14,"Do you have another one?","তোমার আরো একটা আছে? "));
        list.add(new DetailsInfo(15,"Do you think it’s possible?","তুমি কি মনে কর এটা সম্ভব? "));
        list.add(new DetailsInfo(16,"Don’t do that","ওটা কারো না"));
        list.add(new DetailsInfo(17,"From time to time","কখনো কখনো "));
        list.add(new DetailsInfo(18,"From here to there ","এখান থেকে ওখানে"));
        list.add(new DetailsInfo(20,"Have you arrived? ","তুমি পৌছিয়েছ?"));
        list.add(new DetailsInfo(21,"He thinks we don’t want to go","সে ভাবছে আমরা যেতে চাইনা   "));
        list.add(new DetailsInfo(22,"That’s why you need to do the job ","এ কারণেই তোমার চাকরিটি করা প্রয়োজন। "));
        list.add(new DetailsInfo(23,"That’s why he has gone to market  ","এ কারণেই সে বাজারে গিয়েছে।  "));
        list.add(new DetailsInfo(24,"That’s why people admire you","এ কারণেই লোকজন আপনাকে সম্মান করে। "));
        list.add(new DetailsInfo(25,"That’s why I always try to help others  ","এ কারণেই আমি সর্বদা অন্যকে সাহায্য করার চেষ্টা করি।  "));
        list.add(new DetailsInfo(26,"That’s why you fail to understand","এ কারণেই তুমি বুঝতে ব্যর্থ হও।"));
        list.add(new DetailsInfo(27,"That’s why she smiles after seeing you"," এ কারণেই তোমাকে দেখার পর সে হাসে। "));
        list.add(new DetailsInfo(28,"That’s why you need to secure your home","এ কারণেই তোমার বাড়ির নিরাপত্তা বিধান করা দরকার। "));
        list.add(new DetailsInfo(29,"That’s why you’ve got the promotion ","এ কারণেই তুমি পদোন্নতি পেয়েছো। "));
        list.add(new DetailsInfo(30,"That’s why we need to be skilled","এ কারণেই তোমার দক্ষ হওয়া প্রয়োজন। "));
        return list;
    }

    private ArrayList<DetailsInfo> english50()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1," I'm yours ","আমি তোমার। "));
        list.add(new DetailsInfo(2," You are my heart  ","তুমি আমার হৃদয়।  "));
        list.add(new DetailsInfo(3,"You are my everything ","তুমি আমার সবকিছু। "));
        list.add(new DetailsInfo(4,"I adore you ","আমি তোমাকে গভীরভাবে ভালোবাসি।  "));
        list.add(new DetailsInfo(5,"You are the one for me ","তুমিই আমার একজন। "));
        list.add(new DetailsInfo(6," I'm addicted to you"," আমি তোমার প্রতি আসক্ত।"));
        list.add(new DetailsInfo(7,"I'm all about you","আমি তোমাকেই চাই।"));
        list.add(new DetailsInfo(8,"I feel you in every breath  ","আমি তোমায় প্রতি নিঃশ্বাসে অনুভব করি।"));
        list.add(new DetailsInfo(9,"You are my dream  :","তুমি আমার স্বপ্ন। "));
        return list;
    }

    private ArrayList<DetailsInfo> english51()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I've got feelings for you ","তোমার জন্য আমার অনুভূতি রয়েছে। "));
        list.add(new DetailsInfo(2,"I'm getting better ","আমি উন্নতি করছি "));
        list.add(new DetailsInfo(3,"I'm getting ready for bed ","আমি ঘুমানোর জন্য প্রস্তুত হচ্ছি "));
        list.add(new DetailsInfo(4,"I'm getting a tooth ache ","আমি একটি দাঁতে ব্যাথা পেয়েছি  "));
        list.add(new DetailsInfo(5,"I'm getting a ill","আমি অসুস্থ হয়ে যাচ্ছি"));
        list.add(new DetailsInfo(6,"I'm getting married","আমি বিবাহ করতে যাচ্ছি "));
        list.add(new DetailsInfo(7,"He got the job because of being skilled in English","ইংরেজিতে দক্ষ হওয়ার কারণে সে চাকুরি পেয়েছে। "));
        list.add(new DetailsInfo(8,"He didn’t go to office because of being sick :","অসুস্থ হওয়ার কারণে সে অফিসে যেতে পারেনি।  "));
        list.add(new DetailsInfo(9,"Nobody likes him because of being talkative "," বাচাল হওয়ার কারণে তাকে কেউ পছন্দ করে না।   "));
        list.add(new DetailsInfo(10,"They won the game because of being encouraged ","উৎসাহিত হওয়ার কারণে তারা খেলায় জিতেছিল।   "));
        return list;
    }

    private ArrayList<DetailsInfo> english52()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"I wanna talk to him","আমি তার সাথে কথা বলতে চাই।"));
        list.add(new DetailsInfo(2,"What you wanna do now?","তুমি এখন কি করতে চাও?"));
        list.add(new DetailsInfo(3,"I'm gonna have some coffee","আমি একটু কফি খেতে যাচ্ছি। "));
        list.add(new DetailsInfo(4,"What we gonna do now? ","আমরা এখন কি করতে যাচ্ছি? "));
        list.add(new DetailsInfo(5,"I gotta save some money","আমার কিছু টাকা জমাতে হবে।"));
        list.add(new DetailsInfo(6,"I gotta obey the laws","আমাকে আইন মানতে হবে।"));
        return list;
    }

    private ArrayList<DetailsInfo> english53()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Don’t be afraid "," ভয় পেয়ো না।  "));
        list.add(new DetailsInfo(2,"Don’t worry about this ","এ ব্যাপারে চিন্তা করোনা।  "));
        list.add(new DetailsInfo(3,"Don’t break the rules ","নিয়ম ভেঙ্গো না। "));
        list.add(new DetailsInfo(4,"Don’t tell me lies","আমাকে মিথ্যা বলোনা। "));
        list.add(new DetailsInfo(5,"Don’t lose my number","আমার নাম্বারটি হারিয়ে ফেলো না। "));
        list.add(new DetailsInfo(6,"Don’t argue with fools","বোকাদের সাথে তর্ক করোনা।"));
        list.add(new DetailsInfo(7,"Don’t forget your manners "," তোমার আচরণের কথা ভুলো না।  "));
        list.add(new DetailsInfo(8,"Don’t access talk to strangers","অপরিচিত লোকের সাথে অতিরিক্ত কথা বলোনা। "));
        list.add(new DetailsInfo(9,"Don’t make me laugh"," আমাকে হাসিও না।"));
        list.add(new DetailsInfo(10,"Don’t break my heart","আমার হৃদয় ভেঙ্গো না। "));
        list.add(new DetailsInfo(11,"Don’t waste your time","তোমার সময় নষ্ট করোনা।  "));
        list.add(new DetailsInfo(12,"Don’t give up","(চেষ্টা) ছেড়ে দিওনা। "));
        list.add(new DetailsInfo(13,"We are all in complete shock ","আমরা সবাই শোকাহত "));
        list.add(new DetailsInfo(14,"I was astonished ","আমি বিস্মিত হয়েছিলাম।  "));
        list.add(new DetailsInfo(15,"The news came as a complete shock","সংবাদটি যেন একটি বড় আঘাত হয়ে এসেছিল। "));
        list.add(new DetailsInfo(16,"I was shocked to hear the news","আমি খুব কষ্ট পেয়েছিলাম খবরটা শুনে। "));
        list.add(new DetailsInfo(17,"Who could have predicted it?","কেউ কি এটা আগে থেকে চিন্তা করতে পেরেছিল।"));
        list.add(new DetailsInfo(18,"I just can’t get over ","আমি কিছুতেই ভুলতে পারছি না। "));
        list.add(new DetailsInfo(20," was just stunned by her clothes","আমি তার পোশাক দেখে হতভম্ব হয়ে গেলাম। "));
        list.add(new DetailsInfo(21,"I just can't believe the terrible news","আমি এ ভয়ঙ্কর সংবাদটি বিশ্বাস করতে পারছি না।"));
        return list;
    }

    private ArrayList<DetailsInfo> english54()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Have a nice day ","আপনার দিনটি শুভ হোক"));
        list.add(new DetailsInfo(2,"I run every day","আমি প্রতিদিন দৌড়াই "));
        list.add(new DetailsInfo(3,"It's a nice day","এটা একটা চমৎকার দিন  "));
        list.add(new DetailsInfo(4,"How was your day? ","দিনটা কেমন গেছে তোমার? "));
        list.add(new DetailsInfo(5,"It's a windy day","এটা একটি ঝড়ো দিন  "));
        list.add(new DetailsInfo(6,"He took a day off","তিনি একদিন ছুটি নিয়েছিলেন "));
        list.add(new DetailsInfo(7,"I was out all day ","আমি সারাদিন বাইরে ছিলাম"));
        list.add(new DetailsInfo(8,"It's a cloudy day ","এটা একটা মেঘলা দিন  "));
        list.add(new DetailsInfo(9,"I stayed home all day","আমি সারাদিন বাড়িতে ছিলাম "));
        list.add(new DetailsInfo(10,"It was a terrible day","এটা একটা ভয়ানক দিন ছিল "));
        return list;
    }

    private ArrayList<DetailsInfo> english55()
    {
        ArrayList<DetailsInfo> list = new ArrayList<>();


        list.add(new DetailsInfo(1,"Weather forecast","আবহাওয়ার পূর্বাভাস।"));
        list.add(new DetailsInfo(2,"Hurricane"," প্রবল সামুদ্রিক ঝড়।   "));
        list.add(new DetailsInfo(3,"Sandstorm  ","মরুভূমির বালুঝড়। "));
        list.add(new DetailsInfo(4,"Whirlwind"," ঘূর্ণিঝড়। "));
        list.add(new DetailsInfo(5,"Tornado","প্রচন্ড ঘূর্ণিবায়ূ। "));
        list.add(new DetailsInfo(6,"Earthquake ","ভূমিকম্প।"));
        list.add(new DetailsInfo(7,"Rainy day ","বৃষ্টির দিন।। "));
        list.add(new DetailsInfo(8,"Overcast","মেঘাচ্ছন্ন। "));
        list.add(new DetailsInfo(9,"Sunny","রৌদ্রজ্জল। "));
        list.add(new DetailsInfo(10,"Sunshine","রৌদ্র।"));
        list.add(new DetailsInfo(11,"Moonlight","চন্দ্রালোকিত। "));
        list.add(new DetailsInfo(12,"Sunrise","সূর্যোদয়। "));
        list.add(new DetailsInfo(13,"Heavy snow ","ভারি তুষারপাত।"));
        list.add(new DetailsInfo(14,"Say "," ধর/ধরুন। "));
        list.add(new DetailsInfo(15,"Wow! ","বাহ দারুন তো।"));
        list.add(new DetailsInfo(16,"How strange ","আশ্চর্য।"));
        list.add(new DetailsInfo(17,"What a surprise","হঠাৎ যে। "));
        list.add(new DetailsInfo(18,"To be frank","খোলাখুলিভাবে বলতে গেলে।  "));
        list.add(new DetailsInfo(20,"Let it pass","ছেড়ে দিন। "));
        list.add(new DetailsInfo(21,"So kind of you!","আপনার দয়া। "));
        list.add(new DetailsInfo(22,"It’s only a rumor "," নেহাতই গুজব। "));
        list.add(new DetailsInfo(23,"Speak with care","সাবধানে কথা বল। "));
        list.add(new DetailsInfo(24,"Do you have any business with me?","আমার সাথে আপনার কি কোন কাজ আছে? "));
        list.add(new DetailsInfo(25,"There is nothing to fear","ভয়ের কোন কারণ নেই। "));
        list.add(new DetailsInfo(26,"That’s a good effort  ","এটা একটা ভাল প্রচেষ্টা।  "));
        list.add(new DetailsInfo(27,"I’m so proud of you!","আমি তোমার জন্য গর্বিত।"));
        list.add(new DetailsInfo(28,"Keep going"," চলতে থাকো।  "));
        list.add(new DetailsInfo(29,"Believe in yourself  ","নিজের উপর বিশ্বাস রাখ। "));
        list.add(new DetailsInfo(30,"Don’t be afraid ","ভয় পেয়ো না। "));
        list.add(new DetailsInfo(30,"Never give up","হাল ছেড়ো না। "));
        list.add(new DetailsInfo(30,"Don’t get nervous ","ঘাবড়াবে না। "));
        list.add(new DetailsInfo(30,"It looks like a Kite ","এটা ঘুড়ির মত দেখায় "));
        list.add(new DetailsInfo(30,"It looks like a Tree","এটি একটি বৃক্ষের মত দেখায় "));
        list.add(new DetailsInfo(30,"It looks like a pen","এটি দেখতে কলমের মত  "));
        list.add(new DetailsInfo(30,"It looks like a bird","এটি দেখতে পাখির মত "));
        list.add(new DetailsInfo(30,"It looks like an angel "," এটি দেখতে পরীর মত "));
        list.add(new DetailsInfo(30,"It looks like she is lost","দেখে মনে হচ্ছে সে হারিয়ে গেছে "));
        list.add(new DetailsInfo(30,"It looks like they are swimming"," দেখে মনে হচ্ছে তারা সাঁতার কাটছে  "));
        list.add(new DetailsInfo(30,"Let me check","আমাকে দেখতে দাও "));
        list.add(new DetailsInfo(30,"Let’s go have a look","চল গিয়ে দেখি "));
        list.add(new DetailsInfo(30,"I have not scolded you","আমি তোমাকে বকিনি "));
        list.add(new DetailsInfo(30,"Has not Rafiq got salary this month?","রফিক কি এ মাসে বেতন পায়নি?"));
        list.add(new DetailsInfo(30,"Have you told him the matter?","তুমিকি তাকে ব্যাপারটা বলেছ?  "));
        list.add(new DetailsInfo(30,"Have you broken this pen? ","তুমিকি এই কলমটা ভেঙ্গেছ?"));
        list.add(new DetailsInfo(30,"Have you heard this news? ","তোমরা কি এই খবরটা শুনেছ? "));
        list.add(new DetailsInfo(30,"The train has not yet started","ট্রেনটি এখনও ছাড়েনি "));
        list.add(new DetailsInfo(30,"Has Raju replied to your letter?","রাজু কি তোমার চিঠির উত্তর দিয়েছে? "));
        list.add(new DetailsInfo(30,"How absurd! "," কি বাজে/ কি বিরক্তিকর! "));
        list.add(new DetailsInfo(30," It seems to be right","এটা ঠিক মনে হয় "));
        list.add(new DetailsInfo(30,"The bullet missed him by one inch","গুলিটি এক ইঞ্চির জন্য তার গায়ে লাগেনি।"));
        list.add(new DetailsInfo(30,"I missed the bus by 10 minutes ","আমি ১০ মিনিটের জন্য বাসটি মিস করলাম। "));
        list.add(new DetailsInfo(30,"I missed the sunset by 5 minutes","আমি ৫ মিনিটের জন্য সূর্যাস্ত মিস করলাম। "));
        list.add(new DetailsInfo(30,"I missed Rina by half hour","আমি রিনাকে আধাঁ ঘন্টার জন্য পেলাম না। "));
        list.add(new DetailsInfo(30,"General_Agreeing‬ ","সাধারণ সম্মতি প্রকাশ "));
        list.add(new DetailsInfo(30,"I agree with you","আমি তোমার সাথে একমত। "));
        list.add(new DetailsInfo(30,"I think you are right","আমার মনে হয় তুমি সঠিক। "));
        list.add(new DetailsInfo(30,"That’s right","সেটা ঠিক। "));
        list.add(new DetailsInfo(30,"I fully agree with you ","আমি তোমার সাথে সম্পূর্ণ একমত।"));
        list.add(new DetailsInfo(30,"You are absolutely right ","তুমি সম্পূর্ণ সঠিক। "));
        list.add(new DetailsInfo(30,"That’s so true "," সেটা পুরাপুরি সত্য। "));
        list.add(new DetailsInfo(30,"I totally disagree","আমি সম্পূর্ণ অমত। "));
        list.add(new DetailsInfo(30,"I don’t agree with you"," আমি তোমার সাথে একমত নই।"));
        list.add(new DetailsInfo(30,"I’ll never agree","আমি কখনই রাজি হব না।  "));
        list.add(new DetailsInfo(30,"I am sorry to say this ","আমার বলতে খারাপ লাগছে।"));
        return list;
    }




}
