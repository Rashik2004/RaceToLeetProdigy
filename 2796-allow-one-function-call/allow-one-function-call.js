/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let call = false;
    return function(...args){
        let value;
        if(!call){
            call=true;
            value = fn(...args);
        }
        return value;
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
