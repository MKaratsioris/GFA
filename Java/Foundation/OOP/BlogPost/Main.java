package BlogPost;

public class Main {
    public static void main(String[] args) {

        BlogPost lorem = new BlogPost();
        BlogPost blog = new BlogPost();
        BlogPost post = new BlogPost();

        lorem.authorName = "John Doe";
        lorem.publicationDate = "2000.05.04";
        lorem.text = "Lorem ipsum dolor sit amet.";
        lorem.title = "Lorem Ipsum";

        blog.authorName = "Tim Urban";
        blog.publicationDate = "2010.10.10";
        blog.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blog.title = "Wait but why";

        post.authorName = "William Turton";
        post.publicationDate = "2017.03.28";
        post.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he " +
                "wasn’t really into the whole organizer profile thing.\n";
        post.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    }
}
