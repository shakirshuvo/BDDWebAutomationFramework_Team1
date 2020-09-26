//package home;
//
//import com.mysql.cj.util.DnsSrv;
//
//public class HomeWebElements {
//
//public static final String worldButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[1]/a";
//public static final String worldValidationXP="//h1[@class='css-1qq4zod e1bbdwbz0']";
//
//public static final String UsButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[2]/a";
//public static final String usValidationXP="//h1[@class='css-1qq4zod e1bbdwbz0']";
//
//public static final String politicsButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[3]/a";
//public static final String politicsValidationXP="//h1[@class='css-1qq4zod e1bbdwbz0']";
//
//public static final String nyButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[4]/a";
//public static final String nyValidationXP="//h1[@class='css-1qq4zod e1bbdwbz0']";
//
//public static final String businessButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[5]/a";
//public static final String businessValidationXP="//h1[@class='css-10a7uxa e1bbdwbz0']";
//
//public static final String opinionButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[6]/a";
//public static final String opinionValidationXP="//h1[@class='css-rp1nnv e1bbdwbz0']";
//
//public static final String techButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[7]/a";
//public static final String techValidationXP="//h1[@class='css-1qq4zod e1bbdwbz0']";
//
//public static final String scienceButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[8]/a";
//public static final String climateXP="//a[contains(text(),'Climate')]";
//public static final String climateValidationXP="//h1[@class='css-1qq4zod e1bbdwbz0']";
//public static final String spaceCosmosXP="//a[contains(text(),'Space & Cosmos')]";
//
//public static final String healthButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[9]/a";
//public static final String healthPolicyButtonXP="//a[contains(text(),'Health Policy')]";
//public static final String globalHealthXP="//a[contains(text(),'Global Health')]";
//public static final String theNewOldAgeXP="//a[contains(text(),'The New Old Age')]";
//public static final String healthValidationXP="//h1[@class='css-ju59rg e1bbdwbz0']";
//
//public static final String sportsButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[10]/a";
//public static final String baseballCSS="#collection-sports > header > nav:nth-child(2) > ol > li:nth-child(1) > a";
//public static final String nflXP="//nav[1]//ol[1]//li[2]//a[1]";
//public static final String soccerXP="//a[contains(text(),'Soccer')]";
//public static final String nbaXP=" //nav[1]//ol[1]//li[4]//a[1]";
//public static final String tennisXP="//nav[1]//ol[1]//li[9]//a[1]";
//public static final String sportValidationXP="//h1[@class='css-1qq4zod e1bbdwbz0']";
//
//public static final String artsButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[11]/a";
//public static final String booksXP="//a[contains(text(),'Books')]";
//public static final String danceXP="//a[contains(text(),'Dance')]";
//public static final String moviesXP="//a[contains(text(),'Movies')]";
//public static final String artsValidationClass="css-ju59rg e1bbdwbz0";
//
//public static final String BooksButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[12]/a";
//public static final String booksReviewCSS="#collection-books > header > nav > ol > li:nth-child(1) > a";
//public static final String bestSellersCSS="#collection-book-review > header > nav > ol > li:nth-child(1) > a";
//public static final String bestSellerValidationXP="//h1[@class='css-68u1tu']";
//
//public static final String BooksButton1XP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[12]/a";
//public static final String byTheBookCSS="#collection-books > header > nav > ol > li:nth-child(3) > a";
//public static final String byTheBookVerificationXP="//h1[@class='css-x1hvf9 e1bbdwbz0']";
//
//public static final String BooksButton2XP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[12]/a";
//public static final String crimeButtonXP="//*[@id=\"collection-books\"]/header/nav/ol/li[4]/a";
//public static final String crimePageValidationXP="//h1[@class='css-x1hvf9 e1bbdwbz0']";
//
//public static final String childrenBookButtonXP="//*[@id=\"collection-books\"]/header/nav/ol/li[5]/a";
//public static final String childrenBookValidationXP="//h1[@class='css-x1hvf9 e1bbdwbz0']";
//
//public static final String booksReviewPodcastXP="//*[@id=\"collection-books\"]/header/nav/ol/li[6]/a";
//public static final String booksReviewPodcastValidationXP="//h1[@class='css-27xwe6 e1bbdwbz0']";
//
//public static final String nowReadThisButtonCSS="#collection-books > header > nav > ol > li:nth-child(7) > a";
//public static final String NowReadThisValidationXP="//h1[@class='css-x1hvf9 e1bbdwbz0']";
//
//public static final String styleButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[13]/a";
//public static final String fashionButtonCSS="#collection-style > header > nav > ol > li:nth-child(1) > a";
//public static final String fashionButtonValidationClass="css-ju59rg e1bbdwbz0";
//
//public static final String loveButtonCSS="#collection-style > header > nav > ol > li:nth-child(2) > a";
//public static final String loveButtonValidationClass="css-ju59rg e1bbdwbz0";
//
//public static final String selfCareButtonCSS="#collection-style > header > nav > ol > li:nth-child(3) > a";
//public static final String selfCareValidationClass="css-ju59rg e1bbdwbz0";
//
//public static final String foodButtonXP="//*[@id=\"app\"]/div[2]/div[2]/header/div[4]/ul/li[14]/a";
//public static final String wineBeerCocktailCSS="#collection-food > header > nav > ol > li:nth-child(1) > a";
//public static final String wineBeerCocktailValidationClass="css-1qq4zod e1bbdwbz0";
//
//
//
//
//
//
//
//
//
//}
