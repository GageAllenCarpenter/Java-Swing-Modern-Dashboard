package io.github.gageallencarpenter.view.paint;

import java.awt.*;
import java.util.ArrayList;

/**
 * A list of gradients.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class GradientList {

    private final ArrayList<Gradient> gradients = new ArrayList<>();
    private final ArrayList<MultiGradient> multiGradients = new ArrayList<>();

    /**
     * Create a new GradientList.
     */
    public GradientList(){
        initGradients();
    }

    /**
     * initialize the list of gradients.
     */
    private void initGradients(){
        addGradient(new Gradient(new Color(0,0,0), new Color(0,0,0)));
        addGradient(new Gradient(new Color(55,55,55), new Color(55,55,55)));
        addMultiGradient(new MultiGradient(new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
    }

    /**
     * Select a random gradient from the list.
     *
     * @return A random gradient from the list.
     */
    public Gradient randomGradient() {
        int random = (int) (Math.random() * gradients.size());
        return gradients.get(random);
    }

    /**
     * Get a gradient from the list.
     *
     * @param index The index of the gradient.
     * @return The gradient at the index.
     */
    public Gradient getGradient(int index){
        return gradients.get(index);
    }

    /**
     * Add a gradient to the list.
     * @param color The gradient to receive.
     */
    private void addGradient(Gradient color) {
        gradients.add(color);
    }

    /**
     * Get a multi-gradient from the list.
     *
     * @param index The index of the gradient.
     * @return The gradient at the index.
     */
    public MultiGradient getMultiGradient(int index){
        return multiGradients.get(index);
    }

    /**
     * Add a multi-gradient to the list.
     * @param color The gradient to receive.
     */
    private void addMultiGradient(MultiGradient color) {
        multiGradients.add(color);
    }

    public Color getTransparent(){
        return new Color(0,0,0,0);
    }
}
